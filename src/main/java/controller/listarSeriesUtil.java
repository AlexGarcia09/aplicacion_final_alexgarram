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
import model.Series;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import view.PanelSeries;

/**
 *
 * @author Alumno
 */
public class listarSeriesUtil {
    
    private List<Series> obtenerSeriesDesdeBD(int idUsuario) {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        org.hibernate.Query<Series> query = session.createQuery("SELECT p FROM Series p JOIN p.usuarios u WHERE u.id = :idUsuario", Series.class);
        query.setParameter("idUsuario", idUsuario);
        List<Series> series = query.getResultList();

        // Cerrar la sesión de Hibernate
        session.close();

        return series;
    }
    public void mostrarSeries(JPanel jpanel, int idUsuario) {
        // Obtener la lista de películas desde la base de datos
        List<Series> series = obtenerSeriesDesdeBD(idUsuario);

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelSeries = new JPanel();
        PanelSeries.setLayout(new BoxLayout(PanelSeries, BoxLayout.Y_AXIS));


        for (Series serie : series) {
            PanelSeries panelseries = new PanelSeries(serie.getId());
            llenarPanelConSerie(panelseries, serie);
            PanelSeries.add(panelseries);
            jpanel.add(panelseries);
        }
        

        // Crear JScrollPane y agregar el panel de películas
        JScrollPane jScrollPane = new JScrollPane(PanelSeries);

        // Agregar el JScrollPane al panel principal
        jpanel.add(jScrollPane, BorderLayout.CENTER);
    }
    
    
     private void llenarPanelConSerie(PanelSeries panelSeries, Series Serie) {
        // Llenar el PanelPeliculas con la información de la película
        
        panelSeries.getlblTitulo().setText(Serie.getTituloSerie());
        panelSeries.getlblDirector().setText(Serie.getDirectorSerie());
        panelSeries.gettxtResumen().setText(Serie.getResumenSerie());
    }
    public Series obtenerSeriesPorId(int idSerie) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Series> query = session.createQuery("FROM Series WHERE id = :idSerie", Series.class);
        query.setParameter("idSerie", idSerie);
        Series series = query.uniqueResult();

        session.close();

        return series;
    }
    
}
