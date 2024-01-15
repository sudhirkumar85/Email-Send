package send_email;

/**
 *
 * @author Sudhir Kushwaha
 */
public class Send_Email {

    public static void main(String[] args) {
        //Create Email Class Object
        Email email = new Email();

        String to = "jisko bhejna hai uska email id";
        String from = "jo Bhejega uska email id";
        String subject = "Coding With Sudhir";
        String text = "Message from Coding With Sudhir";

        int k = email.send(to, from, subject, text);
        //Checkig email send or not
        if (k == 0) {
            System.out.print("Error");

        } else {
            System.out.println("Success");
        }

    }

}
