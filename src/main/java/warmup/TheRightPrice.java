package warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice
{
    public static void main(String[] args) {
        int price= RandomGenerator.getDefault().nextInt(0,101);
        Scanner scanner =new Scanner(System.in);
        System.out.print("prezzo utente 1:");
        int prezzo1=  scanner.nextInt();
        prezzo1=Math.absExact(prezzo1);
        System.out.print("prezzo utente 2:");
        int prezzo2= scanner.nextInt();
        prezzo2=Math.absExact(prezzo2);

        int diff1=Math.absExact(price-prezzo1);
        int diff2=Math.absExact(price-prezzo2);

        if(diff1<diff2)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("2");
        }




    }
}
