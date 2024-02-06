/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Peliculas;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class ActualizarUtil {
    
    public static void actualizarPelicula(Peliculas pelicula, String nuevoTitulo, String nuevoDirector, Date fecha, String nuevoResumen, String genero) {
        // Actualizar los datos de la película
        pelicula.setTituloPelicula(nuevoTitulo);
        pelicula.setDirectorPelicula(nuevoDirector);
        pelicula.setFechaPelicula((java.sql.Date) fecha);
        pelicula.setResumenPelicula(nuevoResumen);
        pelicula.setGeneroPelicula(genero);
        
        // Guardar la película en la base de datos usando Hibernate
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(pelicula);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Película actualizada correctamente.");
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.close();
        }
    }
}