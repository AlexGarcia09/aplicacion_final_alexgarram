/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Peliculas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import view.PanelPeliculas;

/**
 *
 * @author Alumno
 */
public class listarPeliculasUtil {
    
    private List<Peliculas> obtenerPeliculasDesdeBD(int idUsuario) {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        Query<Peliculas> query = session.createQuery("SELECT p FROM Peliculas p JOIN p.usuarios u WHERE u.id = :idUsuario", Peliculas.class);
        query.setParameter("idUsuario", idUsuario);
        List<Peliculas> peliculas = query.getResultList();

        // Cerrar la sesión de Hibernate
        session.close();

        return peliculas;
    }
    
    
    public void mostrarPeliculas(JPanel jpanel, int idUsuario) {
        // Obtener la lista de películas desde la base de datos
        List<Peliculas> peliculas = obtenerPeliculasDesdeBD(idUsuario);

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelPeliculas = new JPanel();
        PanelPeliculas.setLayout(new BoxLayout(PanelPeliculas, BoxLayout.Y_AXIS));

        // Agregar un PanelPeliculas por cada película
        for (Peliculas pelicula : peliculas) {
            PanelPeliculas panelPeliculas = new PanelPeliculas(pelicula.getId());
            llenarPanelConPelicula(panelPeliculas, pelicula);
            PanelPeliculas.add(panelPeliculas);
            jpanel.add(panelPeliculas);
        }

        // Crear JScrollPane y agregar el panel de películas
        JScrollPane jScrollPane = new JScrollPane(PanelPeliculas);

        // Agregar el JScrollPane al panel principal
        jpanel.add(jScrollPane, BorderLayout.CENTER);
    }
    
    
        private void llenarPanelConPelicula(PanelPeliculas panelPeliculas, Peliculas pelicula) {
        // Llenar el PanelPeliculas con la información de la película
        
        panelPeliculas.getlblTitulo().setText(pelicula.getTituloPelicula());
        panelPeliculas.getlblDirector().setText(pelicula.getDirectorPelicula());
        panelPeliculas.gettxtResumen().setText(pelicula.getResumenPelicula());
    }
        
        public Peliculas obtenerPeliculaPorId(int idPelicula) {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener la película por su ID
        Query<Peliculas> query = session.createQuery("FROM Peliculas WHERE id = :idPelicula", Peliculas.class);
        query.setParameter("idPelicula", idPelicula);
        Peliculas pelicula = query.uniqueResult();

        // Cerrar la sesión de Hibernate
        session.close();

        return pelicula;
    }
    
}
