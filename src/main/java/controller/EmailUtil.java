package controller;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author alexg
 */

public class EmailUtil {

    public static void sendPasswordResetEmail(String correo, String contrasena) {
        final String fromEmail = "alexgrlp61@gmail.com";
        final String password = "eulgtkahyrbknlaz";

        System.out.println("SSLEmail Start");

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session mailSession = Session.getDefaultInstance(props, auth);
        System.out.println("Session created");

        String subject = "Recuperación de Contraseña";
        String body = "Su contraseña de CineCrit es: " + contrasena;

        sendEmail(mailSession, correo, subject, body);
    }
        public static void EmailBienvenida(String correo) {
        final String fromEmail = "alexgrlp61@gmail.com";
        final String password = "eulgtkahyrbknlaz";

        System.out.println("SSLEmail Start");

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session mailSession = Session.getDefaultInstance(props, auth);
        System.out.println("Session created");

        String subject = "Bienvenido a CineCrit";
        String body = "¡Gracias por registrarte en CineCrit! \nBienvenido al equipo.";

        sendEmail(mailSession, correo, subject, body);
    }

    private static void sendEmail(Session session, String toEmail, String subject, String body) {
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("alexgrlp61@gmail.com", "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse("alexgrlp61@gmail.com", false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("Message is ready");
            Transport.send(msg);
            System.out.println("EMail Sent Successfully!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
