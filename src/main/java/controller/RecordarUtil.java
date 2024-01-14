package controller;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jasypt.util.text.AES256TextEncryptor;

public class RecordarUtil {

    public static String obtenerContrasenaPorCorreo(String correo) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Utiliza la consulta HQL para obtener la contraseña encriptada
            String hql = "SELECT u.contrasena FROM Usuarios u WHERE u.email = :correo";
            Query<String> query = session.createQuery(hql, String.class);
            query.setParameter("correo", correo);

            // Obtén la contraseña encriptada o null si no se encuentra
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void enviarCorreo(String correo, String contrasenaEncriptada) {
        try {
            // Desencripta la contraseña usando Jasypt
            AES256TextEncryptor decryptor = new AES256TextEncryptor();
            decryptor.setPassword("gfdasdfsghfdtert");
            String contrasenaDesencriptada = decryptor.decrypt(contrasenaEncriptada);

            // Envia el correo utilizando la clase EmailUtil
            EmailUtil.sendPasswordResetEmail(correo, contrasenaDesencriptada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
