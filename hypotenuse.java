
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        System.out.print("Enter the side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the side B: ");
        b = scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print("Hypotenuse (Side C): "+c+"cm");


        scanner.close();
    }
}