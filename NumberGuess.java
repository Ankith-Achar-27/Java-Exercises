
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess,randNum;
        randNum = random.nextInt(0,11);
        int attempts = 0;
        do {
            System.out.print("Enter a number between 1-10: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess<randNum){
                if (attempts>10){
                    System.out.println("You LOOSE.....attempts exceeded the limit 10.");
                }
                else
                    System.out.println("Too LOW....TRY AGAIN!!!");
            }
            else if (guess>randNum) {
                if (attempts>10){
                    System.out.println("You LOOSE.....attempts exceeded the limit 10.");
                }
                else
                    System.out.println("Too HIGH....TRY AGAIN!!!");
            }
            else{
                    System.out.println("CORRECT the number is "+randNum);
                    System.out.println("The # of attempts to guess was : "+attempts);

            }

        }while (guess!=randNum);
        scanner.close();
    }
}