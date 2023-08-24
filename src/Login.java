import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password";
        boolean userFound = false;
        Scanner myScanner = new Scanner(System.in);

        //Loops until correct login is entered
        while (true) {
            //User enters username
            System.out.println("Enter username: ");
            //Checks user is found
            if (myScanner.nextLine().equals(username)) {
                userFound = true;
            }
            //User enters password
            System.out.println("Enter password: ");
            //Checks username and password are correct
            if (myScanner.nextLine().equals(password) && userFound) {
                System.out.println("Welcome...");
                break;
            } else {
                System.out.println("ACCESS DENIED! Hit enter to retry.");
            }
            myScanner.nextLine();

            //Clears screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
