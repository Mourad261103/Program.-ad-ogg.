package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched)
    {
        for (int i = 0; i <strings.length ; i++)
        {
            if (strings[i]==searched)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched)
    {

        Arrays.sort(strings);//RICORDA PRIMA DI USARE IL BINARY SORT DEVI ORDINARE
      return Arrays.binarySearch(strings,searched)>=0;
    }



}
