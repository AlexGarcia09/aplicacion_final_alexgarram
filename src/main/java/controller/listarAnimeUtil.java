/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.sql.Date;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Anime;
import model.Peliculas;
import model.Resenas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import view.PanelAnimes;
import view.PanelPeliculas;

/**
 *
 * @author Alumno
 */
public class listarAnimeUtil {
    
         public void mostrarAnimes(JPanel jpanel, int idUsuario) {
        // Obtener la lista de películas desde la base de datos
        List<Anime> anime = obtenerAnimesDesdeBD(idUsuario);

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelAnimes = new JPanel();
        PanelAnimes.setLayout(new BoxLayout(PanelAnimes, BoxLayout.Y_AXIS));

        // Agregar un PanelPeliculas por cada película
        for (Anime animes : anime) {
            PanelAnimes panelAnimes = new PanelAnimes(animes.getId());
            llenarPanelConAnime(panelAnimes, animes);
            PanelAnimes.add(panelAnimes);
            jpanel.add(panelAnimes);
        }

        // Crear JScrollPane y agregar el panel de películas
        JScrollPane jScrollPane = new JScrollPane(PanelAnimes);

        // Agregar el JScrollPane al panel principal
        jpanel.add(jScrollPane, BorderLayout.CENTER);
    }

    public List<Anime> obtenerAnimesDesdeBD(int idUsuario) {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        org.hibernate.Query<Anime> query = session.createQuery("SELECT p FROM Anime p JOIN p.usuarios u WHERE u.id = :idUsuario", Anime.class);
        query.setParameter("idUsuario", idUsuario);
        List<Anime> anime = query.getResultList();
        

        // Cerrar la sesión de Hibernate
        session.close();

        return anime;
    }

    private void llenarPanelConAnime(PanelAnimes panelAnime, Anime anime) {
        // Llenar el PanelPeliculas con la información de la película
        
        panelAnime.getlblTitulo().setText(anime.getTituloAnime());
        panelAnime.getlblDirector().setText(anime.getDirectorAnime());
        panelAnime.gettxtResumen().setText(anime.getResumenAnime());
    }
    public Anime obtenerAnimePorId(int idAnime) {
        // Abrir una sesión de Hibernate
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Consultar la base de datos para obtener el anime por su ID
        Query<Anime> query = session.createQuery("FROM Anime WHERE id = :idAnime", Anime.class);
        query.setParameter("idAnime", idAnime);
        Anime anime = query.uniqueResult();

        // Cerrar la sesión de Hibernate
        session.close();

        return anime;
    }
    public void guardarReseña(String tituloAnime, int valoracion, String comentario, Date fecha) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction tx = null;

    try {
        tx = session.beginTransaction();

        // Obtener la película por su título
        Anime anime = obtenerAnimePorTitulo(tituloAnime);

        // Crear una nueva instancia de Resena
        Resenas resena = new Resenas();
        resena.setAnime(anime);
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
        public Anime obtenerAnimePorTitulo(String tituloAnime) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Anime anime = null;
        try {
            // Query para obtener la película por su título
            Query<Anime> query = session.createQuery("FROM Anime WHERE tituloAnime = :titulo", Anime.class);
            query.setParameter("titulo", tituloAnime);
            anime = query.uniqueResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return anime;
    }           
    
}
