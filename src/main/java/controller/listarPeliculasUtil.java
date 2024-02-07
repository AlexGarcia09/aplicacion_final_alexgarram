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
    
    
        public void mostrarPeliculas(JPanel jPanel, int idUsuario) {
            List<Peliculas> peliculas = obtenerPeliculasDesdeBD(idUsuario);

            jPanel.removeAll();

            JPanel panelPeliculas = new JPanel();
            panelPeliculas.setLayout(new BoxLayout(panelPeliculas, BoxLayout.Y_AXIS));

            for (Peliculas pelicula : peliculas) {
                PanelPeliculas panelPelicula = new PanelPeliculas(pelicula.getId());
                llenarPanelConPelicula(panelPelicula, pelicula);
                panelPeliculas.add(panelPelicula);
            }
            jPanel.add(panelPeliculas);
        }
    
    
        private void llenarPanelConPelicula(PanelPeliculas panelPeliculas, Peliculas pelicula) {
        panelPeliculas.getlblTitulo().setText(pelicula.getTituloPelicula());
        panelPeliculas.getlblDirector().setText(pelicula.getDirectorPelicula());
        panelPeliculas.gettxtResumen().setText(pelicula.getResumenPelicula());
    }
        
        public Peliculas obtenerPeliculaPorId(int idPelicula) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Peliculas> query = session.createQuery("FROM Peliculas WHERE id = :idPelicula", Peliculas.class);
        query.setParameter("idPelicula", idPelicula);
        Peliculas pelicula = query.uniqueResult();

        session.close();

        return pelicula;
    }
    
}
