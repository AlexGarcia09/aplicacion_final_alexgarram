/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Resenas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import view.PanelResenaS;
import view.PanelResenap;

/**
 *
 * @author alexg
 */
public class ListarResenasSeries {
     public void mostrarResenas(JPanel jPanel) {
        List<Resenas> resenas = obtenerResenasDesdeBD();

        jPanel.removeAll();

        JPanel panelResenas = new JPanel();
        panelResenas.setLayout(new BoxLayout(panelResenas, BoxLayout.Y_AXIS));

        for (Resenas resena : resenas) {
            PanelResenaS panelResena = new PanelResenaS(resena);
            llenarPanelConResena(panelResena, resena);
            panelResenas.add(panelResena);
        }

        jPanel.add(panelResenas);
    }

    private List<Resenas> obtenerResenasDesdeBD() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Resenas> query = session.createQuery("FROM Resenas r JOIN FETCH r.series", Resenas.class);
        List<Resenas> resenas = query.getResultList();

        session.close();

        return resenas;
    }

    private void llenarPanelConResena(PanelResenaS panelResena, Resenas resena) {
        panelResena.getlblTitulo().setText(resena.getSeries().getTituloSerie());
        panelResena.getlblValoracion().setText(Integer.toString(resena.getValoracionResena()));
        panelResena.gettxtResumen().setText(resena.getComentarioResena());
        panelResena.gettxtfecha().setText(resena.getFechaResena().toString());
    }
}
