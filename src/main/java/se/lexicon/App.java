package se.lexicon;

import se.lexicon.exception.EmailException;
import se.lexicon.model.Email;
import se.lexicon.service.EmailService;
import se.lexicon.service.EmailServiceImpl;

public class App {
    public static void main(String[] args) {

        EmailService service = new EmailServiceImpl();
        try {
            service.createAndSend("mehrdad.javan@lexicon.se", "test subject 2", "test content 2");
            service.findAll().forEach(email -> System.out.println(email.summary()));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }

    }

}
