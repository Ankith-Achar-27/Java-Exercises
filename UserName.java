import java.util.Scanner;

public class UserName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username;
        //username should be between 4-12 characters
        //username should not contain space or underscore
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        if (username.length()<4 || username.length()>12){
            System.out.println("User Name should be between 4 and 12 characters!!");
        }
        else if (username.contains(" ")||username.contains("_")) {
            System.out.println("username should not contain space or underscore");
        }
        else
            System.out.printf("Username: %s",username);
        scanner.close();
    }
}