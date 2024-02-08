/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Peliculas;
import model.Resenas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import view.PanelPeliculas;

/**
 *
 * @author Alumno
 */
public class listarPeliculasUtil {
    
    public List<Peliculas> obtenerPeliculasDesdeBD(int idUsuario) {
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
     
 public void guardarReseña(String tituloPelicula, int valoracion, String comentario, Date fecha) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction tx = null;

    try {
        tx = session.beginTransaction();

        // Obtener la película por su título
        Peliculas pelicula = obtenerPeliculaPorTitulo(tituloPelicula);

        // Crear una nueva instancia de Resena
        Resenas resena = new Resenas();
        resena.setPeliculas(pelicula);
        resena.setValoracionResena(valoracion);
        resena.setComentarioResena(comentario);
        resena.setFechaResena(fecha); // Establecer la fecha de la reseña

        // Guardar la reseña en la base de datos
        session.save(resena);

        tx.commit();
    } catch (Exception e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
    
}
        public Peliculas obtenerPeliculaPorTitulo(String tituloPelicula) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Peliculas pelicula = null;
        try {
            // Query para obtener la película por su título
            Query<Peliculas> query = session.createQuery("FROM Peliculas WHERE tituloPelicula = :titulo", Peliculas.class);
            query.setParameter("titulo", tituloPelicula);
            pelicula = query.uniqueResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return pelicula;
    }
    
}
