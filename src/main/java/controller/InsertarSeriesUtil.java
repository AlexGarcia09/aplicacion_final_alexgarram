package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Series;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alexg
 */
public class InsertarSeriesUtil {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void insertarSerie(int idUsuario, String titulo, String director, String resumen, String fecha, String genero) {

        Usuarios usuario = obtenerUsuarioPorId(idUsuario);

        if (usuario != null) {
            Series series = new Series();


            series.setUsuarios(usuario);


            series.setTituloSerie(titulo);
            series.setDirectorSerie(director);
            series.setResumenSerie(resumen);
            series.setGeneroPelicula(genero);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fechaFormateada = dateFormat.parse(fecha);
                series.setFechaPelicula(new java.sql.Date(fechaFormateada.getTime()));
            } catch (java.text.ParseException ex) {
                Logger.getLogger(InsertarSeriesUtil.class.getName()).log(Level.SEVERE, null, ex);
            }

            try (Session sesion = sessionFactory.openSession()) {
                Transaction tx = sesion.beginTransaction();
                sesion.save(series);
                tx.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Usuarios obtenerUsuarioPorId(int idUsuario) {
        try (Session sesion = sessionFactory.openSession()) {
            return sesion.createQuery("FROM Usuarios WHERE id = :idUsuario", Usuarios.class)
                    .setParameter("idUsuario", idUsuario)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
