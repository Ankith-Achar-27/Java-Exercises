
import java.util.Scanner;

public class Timer {
    public static void main (String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from where to start counting: ");
        int num = scanner.nextInt();
        for(int i = num;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!");
        scanner.close();
        }
    }
