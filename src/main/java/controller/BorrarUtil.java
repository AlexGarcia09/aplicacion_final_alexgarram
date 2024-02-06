/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Peliculas;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author alexg
 */


public class BorrarUtil {

    public static void borrarPelicula(Peliculas pelicula) {
        // Guardar la película en la base de datos usando Hibernate
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(pelicula);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Película borrada correctamente.");
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al borrar la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.close();
        }
    }
    public static void borrarPeliculaPorId(int idPelicula) {
         listarPeliculasUtil util = new listarPeliculasUtil();
    Peliculas pelicula = util.obtenerPeliculaPorId(idPelicula);
    if (pelicula != null) {
        borrarPelicula(pelicula);
    } else {
        JOptionPane.showMessageDialog(null, "La película con ID " + idPelicula + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}