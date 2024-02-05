/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.HibernateUtil;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Anime;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alumno
 */
public class ListarAnime extends javax.swing.JPanel {

    /**
     * Creates new form ListarPeliculas
     */
    public ListarAnime() {
        initComponents();
          mostrarAnimes();
          
    }
    
     private void mostrarAnimes() {
        // Obtener la lista de películas desde la base de datos
        List<Anime> anime = obtenerAnimesDesdeBD();

        // Crear el panel principal que contiene los paneles de películas
        JPanel PanelAnimes = new JPanel();
        PanelAnimes.setLayout(new BoxLayout(PanelAnimes, BoxLayout.Y_AXIS));

        // Agregar un PanelPeliculas por cada película
        for (Anime Anime : anime) {
            PanelAnimes panelAnimes = new PanelAnimes();
            llenarPanelConAnime(panelAnimes, Anime);
            PanelAnimes.add(panelAnimes);
            jPanel1.add(panelAnimes);
        }

        // Crear JScrollPane y agregar el panel de películas
        JScrollPane jScrollPane = new JScrollPane(PanelAnimes);

        // Agregar el JScrollPane al panel principal
        add(jScrollPane, BorderLayout.CENTER);
    }

    private List<Anime> obtenerAnimesDesdeBD() {
        // Recuperar datos de la base de datos usando HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Usar una consulta HQL para obtener las películas
        Query<Anime> query = session.createQuery("FROM Anime", Anime.class);
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

                  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

