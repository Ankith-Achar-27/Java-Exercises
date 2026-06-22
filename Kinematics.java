
import java.util.Scanner;

public class Kinematics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double speed,distance,time;
        int choice;


        do {
            System.out.println("****** Kinematics System ********");
            System.out.println("1.Speed \t2.Distance\t3.Time\t4.Exit");
            System.out.print("Enter your Choice:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the Distance(in mtr):");
                    distance = scanner.nextDouble();
                    System.out.print("Enter the Time(in sec):");
                    time = scanner.nextDouble();
                    speed = distance/time;
                    System.out.printf("Speed: %.2fm/s\n",speed);
                    break;
                case 2:
                    System.out.print("Enter the Speed(in mtr/sec):");
                    speed = scanner.nextDouble();
                    System.out.print("Enter the Time(in sec):");
                    time = scanner.nextDouble();
                    distance = speed*time;
                    System.out.printf("Distance: %.2fm\n",distance);
                    break;
                case 3:
                    System.out.print("Enter the Distance(in mtr):");
                    distance = scanner.nextDouble();
                    System.out.print("Enter the Speed(in mtr/sec):");
                    speed = scanner.nextDouble();
                    time = distance/speed;
                    System.out.printf("Distance: %.2fsec\n",time);
                    break;

               case 4:
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
