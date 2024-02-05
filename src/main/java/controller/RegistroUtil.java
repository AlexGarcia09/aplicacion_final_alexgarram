package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexg
 */

public class RegistroUtil {

    public static boolean registrarUsuario(String nombre, String email, String contrasena) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

           
            model.Usuarios nuevoUsuario = new model.Usuarios();
            
           
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setEmail(email);
            nuevoUsuario.setContrasena(contrasena);

            session.save(nuevoUsuario);

            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}