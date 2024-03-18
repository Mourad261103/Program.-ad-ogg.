package warmup;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("monkey a is smiling?:");
        boolean asmile= scanner.nextBoolean();
        System.out.print("monkey b is smiling?:");
        boolean bsmile= scanner.nextBoolean();

        if(asmile&&bsmile||!asmile&&!bsmile)
        {
            System.out.println("We are in trouble ");
        }


    }
}
