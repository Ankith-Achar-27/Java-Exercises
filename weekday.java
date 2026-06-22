import java.util.Scanner;

public class weekday {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the week name:");
        String day = scanner.nextLine().toLowerCase();
        switch (day){
            case "monday","tuesday","wednesday","thursday","friday"->
                    System.out.println("It's a Weekday😔");
            case "saturday","sunday"->
                    System.out.println("It's a Weekend😁😁");
            default -> System.out.println("Invalid input");

        }
        scanner.close();
        }
    }
