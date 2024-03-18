package warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {

        int n= RandomGenerator.getDefault().nextInt(0,4);
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("num:");
            int num= scanner.nextInt();
            if(num==n)
            {
                break;
            }
        }
    }
}
