package strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string)
    {
       Scanner scanner= new Scanner(string);
       int n=0;
       while(scanner.hasNext())
       {
           String word= scanner.next();
           if (word.charAt(word.length()-1)=='y'||word.charAt(word.length()-1)=='Y'||word.charAt(word.length()-1)=='z'||word.charAt(word.length()-1)=='Z')
           {
             n++;
           }
       }
      return n;
    }


}
