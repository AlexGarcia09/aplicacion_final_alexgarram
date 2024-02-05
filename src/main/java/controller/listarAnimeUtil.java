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
import model.Anime;
import model.Peliculas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import view.PanelAnimes;
import view.PanelPeliculas;

/**
 *
 * @author Alumno
 */
public class listarAnimeUtil {
    
         public void mostrarAnimes(JPanel jpanel) {
        // Obtener la lista de películas desde la base de datos
        List<Anime> anime = obtenerAnimesDesdeBD();

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelAnimes = new JPanel();
        PanelAnimes.setLayout(new BoxLayout(PanelAnimes, BoxLayout.Y_AXIS));

        // Agregar un PanelPeliculas por cada película
        for (Anime animes : anime) {
            PanelAnimes panelAnimes = new PanelAnimes();
            llenarPanelConAnime(panelAnimes, animes);
            PanelAnimes.add(panelAnimes);
            jpanel.add(panelAnimes);
        }

        // Crear JScrollPane y agregar el panel de películas
        JScrollPane jScrollPane = new JScrollPane(PanelAnimes);

        // Agregar el JScrollPane al panel principal
        jpanel.add(jScrollPane, BorderLayout.CENTER);
    }

    private List<Anime> obtenerAnimesDesdeBD() {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        org.hibernate.Query<Anime> query = session.createQuery("FROM Anime", Anime.class);
        List<Anime> anime = query.getResultList();
        System.out.println(anime.size());

        // Cerrar la sesión de Hibernate
        session.close();

        return anime;
    }

    private void llenarPanelConAnime(PanelAnimes panelAnime, Anime anime) {
        // Llenar el PanelPeliculas con la información de la película
        
        panelAnime.getlblTitulo().setText("Título: " + anime.getTituloAnime());
        panelAnime.getlblDirector().setText("Director: " + anime.getDirectorAnime());
        panelAnime.gettxtResumen().setText("Resumen: " + anime.getResumenAnime());
    }

                  
    
}
