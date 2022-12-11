/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.mail;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author rebeccabiju
 */
public class Mail {
    public static void sendMail(String receiver, String subject, String body) {
        
        String from = "codeent008@gmail.com";
        String pass="kyyhcmbryvcpqmqt";
        
        //String sub = "Your Order is dispatched for delivery";
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,pass);  
         }    
        });    
        //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(receiver));    
         message.setSubject(subject);    
         message.setText(body);    

//         MimeBodyPart messageBodyPart = new MimeBodyPart();
//
//        Multipart multipart = new MimeMultipart();
//        
//        String file = "/Users/rebeccabiju/Desktop/Writesheet.xlsx";
//        String fileName = "Statement.xlsx";
//        DataSource source = new FileDataSource(file);
//        messageBodyPart.setDataHandler(new DataHandler(source));
//        messageBodyPart.setFileName(fileName);
//        multipart.addBodyPart(messageBodyPart);
//
//        message.setContent(multipart);
           
           
           //send message  
           Transport.send(message);    
           System.out.println("Email sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}  
    }
    
}
