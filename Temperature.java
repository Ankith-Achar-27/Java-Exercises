
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp,newTemp = 0;
        int choice;


        do {
            System.out.println("****** Temperature Conversion System ********");
            System.out.println("1.Celsius to Fahreheit \t2.Fahreheit to Celsius\t3.Exit");
            System.out.print("Enter your Choice:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the Celsius(in degree):");
                    temp = scanner.nextDouble();
                    newTemp = (temp*9/5)+32;
                    System.out.printf("New Weight: %.2fF\n",newTemp);
                    break;
                case 2:
                    System.out.print("Enter the Fahreheit(in F):");
                    temp = scanner.nextDouble();
                    newTemp =  (temp-32)*((double) 5 /9);
                    System.out.printf("New Weight: %.2fdegree\n",newTemp);
                    break;
                case 3:
                    System.out.println("Exiting the program......");
                    scanner.close();
                    return;
                default:
                    System.out.print("Invalid Choice");
                    System.exit(0);
            }
        }while(true);
    }
}

