

import java.util.Scanner;

public class StarPyramid {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****NUMBER PYRAMID****");
        int num = 1;
        System.out.print("Enter the number of steps(integer and non negative only):");
        int n = scanner.nextInt();
        if(n<1){
            System.out.println("Invalid Number(greater that 0 only)......");
        }
        else {
            for (int i = 1; i <= n; i++) {
                for (int space = 1; space <= (n - i); space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(num);
                }
                num += 1;
                System.out.println();
            }
        }
        scanner.close();
        }
    }
