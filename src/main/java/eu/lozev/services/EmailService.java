package eu.lozev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public final static String FROM = "lozev.eu";
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        message.setFrom(FROM);

        String test1 = "test";
        try {
            javaMailSender.send(message);
        } catch (Exception e) {
            String test = "test";
        }


        String test = "test";
    }

}
