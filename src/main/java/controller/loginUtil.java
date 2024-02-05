package controller;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jasypt.util.text.AES256TextEncryptor;

/**
 *
 * @author alexg
 */

public class loginUtil {
    public static int idUsuarioActual;

    public static int autenticarUsuario(String correo, String contrasena) {
        String contrasenaEncriptada = RecordarUtil.obtenerContrasenaPorCorreo(correo);

        if (contrasenaEncriptada != null) {

            AES256TextEncryptor decryptor = new AES256TextEncryptor();
            decryptor.setPassword("gfdasdfsghfdtert");  
            String contrasenaDesencriptada = decryptor.decrypt(contrasenaEncriptada);

            if (contrasena.equals(contrasenaDesencriptada)) {

                idUsuarioActual = obtenerIdUsuarioPorCorreo(correo);
                return idUsuarioActual;
            }
        }

        return 0; 
    }

    public static int getIdUsuarioActual() {
        return idUsuarioActual;
    }

    private static int obtenerIdUsuarioPorCorreo(String correo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
        Query<Integer> query = session.createQuery("SELECT id FROM Usuarios WHERE email = :correo", Integer.class);
            query.setParameter("correo", correo);
            return query.uniqueResult();
        } finally {
            session.close();
        }
     
    }
    public void cerrarsesion(){
        
        idUsuarioActual = 0;
    
}
}
