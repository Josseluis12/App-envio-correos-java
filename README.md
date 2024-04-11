# EmailSender

## Descripción
Este proyecto consiste en una aplicación Java que permite enviar correos electrónicos utilizando la API JavaMail.

## Funcionamiento
El archivo `EmailSender.java` contiene el código fuente necesario para configurar un servidor SMTP, autenticarse con credenciales de correo electrónico y enviar un mensaje de correo electrónico simple.

## Configuración

### Servidor SMTP
Antes de utilizar la aplicación, asegúrate de configurar correctamente el servidor SMTP. En el código proporcionado se utiliza el servidor SMTP de Gmail como ejemplo:

```java
String host = "smtp.gmail.com";
int port = 465; // Puerto SSL
```

Si estás utilizando un servidor SMTP diferente, modifica las variables `host` y `port` según corresponda.

### Autenticación de correo electrónico
Para enviar correos electrónicos, debes proporcionar las credenciales de tu cuenta de correo electrónico:

```java
String username = "// Tu email";
String password = "// Clave del email";
```

Reemplaza `username` y `password` con tu dirección de correo electrónico y tu contraseña respectivamente.

### Destinatario del correo electrónico
Puedes especificar la dirección de correo electrónico del destinatario en el código:

```java
message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("//Destinatario del correo"));
```

Reemplaza `//Destinatario del correo` con la dirección de correo electrónico del destinatario.

## Ejecución
Para ejecutar la aplicación, simplemente compila y ejecuta la clase `EmailSender.java`. Una vez ejecutada, la aplicación enviará el correo electrónico especificado.

## Nota
Este código es solo un ejemplo y puede requerir modificaciones para adaptarse a tu entorno de desarrollo específico, como la configuración del servidor SMTP, las credenciales de correo electrónico y los destinatarios del correo electrónico.
