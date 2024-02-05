package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Anime;
import model.Peliculas;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alexg
 */
public class InsertarAnimeUtil {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void insertarAnime(int idUsuario, String titulo, String director, String resumen, String fecha, String genero) {

        Usuarios usuario = obtenerUsuarioPorId(idUsuario);

        if (usuario != null) {
            Anime anime = new Anime();


            anime.setUsuarios(usuario);


            anime.setTituloAnime(titulo);
            anime.setDirectorAnime(director);
            anime.setResumenAnime(resumen);
            anime.setGeneroAnime(genero);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fechaFormateada = dateFormat.parse(fecha);
                anime.setFechaAnime(new java.sql.Date(fechaFormateada.getTime()));
            } catch (java.text.ParseException ex) {
                Logger.getLogger(InsertarAnimeUtil.class.getName()).log(Level.SEVERE, null, ex);
            }

            try (Session sesion = sessionFactory.openSession()) {
                Transaction tx = sesion.beginTransaction();
                sesion.save(anime);
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
