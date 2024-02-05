package controller;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jasypt.util.text.AES256TextEncryptor;

/**
 *
 * @author alexg
 */

public class RecordarUtil {

    public static String obtenerContrasenaPorCorreo(String correo) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            String hql = "SELECT u.contrasena FROM Usuarios u WHERE u.email = :correo";
            Query<String> query = session.createQuery(hql, String.class);
            query.setParameter("correo", correo);

            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void enviarCorreo(String correo, String contrasenaEncriptada) {
        try {
           
            AES256TextEncryptor decryptor = new AES256TextEncryptor();
            decryptor.setPassword("gfdasdfsghfdtert");
            String contrasenaDesencriptada = decryptor.decrypt(contrasenaEncriptada);

            
            EmailUtil.sendPasswordResetEmail(correo, contrasenaDesencriptada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
