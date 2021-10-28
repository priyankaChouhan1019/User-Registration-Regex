import java.util.Scanner;

public class RegexUserRegistration {
    Scanner scanner = new Scanner(System.in);
    RegexValidations regexValidations =new RegexValidations();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        regexValidations.firstName(firstName);
    }

    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        regexValidations.lastName(lastName);
    }
}
