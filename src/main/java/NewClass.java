import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewClass {
    public static void main(String[] args) {
        // Configurar Hibernate
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Abrir una sesión de Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Iniciar una transacción
            Transaction transaction = session.beginTransaction();

            // Crear un nuevo usuario
            Usuarios nuevoUsuario = new Usuarios();
            nuevoUsuario.setNombre("NombreUsuario");
            nuevoUsuario.setContrasena("Contraseña123");
            nuevoUsuario.setEmail("correo@example.com");

            // Guardar el nuevo usuario en la base de datos
            session.save(nuevoUsuario);

            // Confirmar la transacción
            transaction.commit();

            System.out.println("Usuario creado con ID: " + nuevoUsuario.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar la sesión de Hibernate al finalizar
            sessionFactory.close();
        }
    }
}
