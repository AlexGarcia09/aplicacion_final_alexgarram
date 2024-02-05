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
    
    private List<Peliculas> obtenerPeliculasDesdeBD() {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        Query<Peliculas> query = session.createQuery("FROM Peliculas", Peliculas.class);
        List<Peliculas> peliculas = query.getResultList();
        System.out.println(peliculas.size());

        // Cerrar la sesión de Hibernate
        session.close();

        return peliculas;
    }
    
    
    public void mostrarPeliculas(JPanel jpanel) {
        // Obtener la lista de películas desde la base de datos
        listarPeliculasUtil listar = new listarPeliculasUtil();
        List<Peliculas> peliculas = listar.obtenerPeliculasDesdeBD();

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelPeliculas = new JPanel();
        PanelPeliculas.setLayout(new BoxLayout(PanelPeliculas, BoxLayout.Y_AXIS));

        // Agregar un PanelPeliculas por cada película
        for (Peliculas pelicula : peliculas) {
            PanelPeliculas panelPeliculas = new PanelPeliculas();
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
    
}
