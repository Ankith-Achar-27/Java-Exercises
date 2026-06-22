
import java.util.Random;


public class Flipcoin {
    public static void main(String[] args){
        Random random = new Random();
        boolean isHead;
        isHead = random.nextBoolean();

        if (isHead){
            System.out.println("HEADS");
        }
        else
            System.out.println("TAILS");
    }

}