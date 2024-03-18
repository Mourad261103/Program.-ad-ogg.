package strings;

import java.util.Scanner;

public class EqualIsNot {
    public static boolean equalIsNot(String string)
    {
        int index1=-1;
        int index2=-1;
        int i=0;
        int n=0;
       while(true)
       {
           index1=string.indexOf("is",index1)+1;
           if (index1==0) {
               break;
           }
           i++;
       }
        while(true)
        {
            index2=string.indexOf("not",index2)+1;
            if (index2==0) {
                break;
            }
                n++;
        }
        return n - i == 0;
    }


}
