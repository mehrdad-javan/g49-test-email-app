package se.lexicon;

import se.lexicon.exception.DataNotFoundException;
import se.lexicon.exception.EmailException;

public class EmailExceptionHandler {

    public static void handleException(Exception exception) {
        if (exception instanceof NullPointerException) {
            System.out.println("NullPointerException: " + exception.getMessage());
        } else if (exception instanceof DataNotFoundException) {
            System.out.println("DataNotFoundException: " + exception.getMessage());
        } else if (exception instanceof EmailException) {
            // Handle the email sending exception here
            System.out.println("Email sending failed. Check your email configuration.");
        } else {
            // Handle other exceptions here
            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();
        }
    }

}