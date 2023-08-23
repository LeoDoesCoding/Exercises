import java.util.Scanner;

public class Aug23 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] usernames = {"Admin", "Amanda", "Jake", "Daniel"};
        String[] passwords = {"password", "abc", "qwerty", "123"};


        System.out.println("Enter a username:");
        String input = myScanner.nextLine();
        boolean found = false;
        int index = 0;

        //Until username is found, loop
        while (!found){
            //Look for username (compare both to uppercase)
            for (int i = 0; i < usernames.length; i++){
                if (usernames[i].equalsIgnoreCase(input)){
                    found = true;
                    index = i;
                    break;
                }
            }
            //If username not found, ask user to try again and search again
            if (!found){
                System.out.println("Username not found. Please try again:");
                input = myScanner.nextLine();
            }
        }


        //Asks user to enter password
        System.out.println("Username accepted. Enter password:");
        input = myScanner.nextLine();


        //Attempts password, if incorrect, allow 2 more attempts.
        for (int i = 2; i > 0; i--) {
            //Check if password matches username
            if (passwords[index].equals(input)) {
                System.out.println("Login successful. Welcome...");
                break;
            } else {
                System.out.println("Incorrect password. You have " + i + " more attempts.");
                input = myScanner.nextLine();
            }
        }
        //If attempts have run out and the last attempt was unsuccessful, tell user they have run out of attempts
        if (!passwords[index].equals(input)) {
            System.out.println("You have run out of attempts, access denied.");
        }
    }
}
