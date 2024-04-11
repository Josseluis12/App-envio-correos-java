import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

    public static void main(String[] args) {
        // Datos de configuración del servidor SMTP
        String host = "smtp.gmail.com";
        int port = 465; // Puerto SSL
        //Explicacion:
        //UserName -> Vuestro Correo
        String username = "// Tu email";
        //Pass -> Vuestro tocken
        String password = "//Clave del email";

        // Propiedades de la sesión
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");

        // Crear una sesión de correo
        Session session = Session.getDefaultInstance(props);

        try {
            // Crear un objeto mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            //Dentro del .parse(Correo del Destinatario)
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("//Destinatario del correo"));
            message.setSubject("Correo Desde Java");
            message.setText("Hola Profe");

            // Enviar el mensaje
            Transport transport = session.getTransport("smtp");
            transport.connect(host, port, username, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

            System.out.println("El mensaje fue enviado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
