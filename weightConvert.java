import java.util.Scanner;

public class weightConvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight,newWeight = 0;
        int choice;


        do {
            System.out.println("****** Weight Conversion System ********");
            System.out.println("1.Kgs to lbs\t2.lbs to Kgs\t3.Exit");
            System.out.print("Enter your Choice:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the weight(in kgs):");
                    weight = scanner.nextDouble();
                    newWeight = 2.2 * weight;
                    System.out.printf("New Weight: %.2flbs\n",newWeight);
                    break;
                case 2:
                    System.out.print("Enter the weight(in lbs):");
                    weight = scanner.nextDouble();
                    newWeight =  weight/2.2;
                    System.out.printf("New Weight: %.2fkg\n",newWeight);
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