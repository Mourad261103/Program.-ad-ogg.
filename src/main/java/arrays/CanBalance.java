package arrays;

import java.util.Arrays;
import java.util.Spliterator;

public class CanBalance
{
    public static boolean canBalance(int[] v)
    {
        boolean answ=false;

        for (int i = 0; i <v.length ; i++)
        {
           int s1=0;
           int s2=0;
            for (int j = i; j >=0 ; j--)
            {
                s1=s1+v[j];
            }
            for (int j = i+1; j < v.length; j++)
            {
                s2=s2+v[j];
            }
          if(s1==s2)
          {
              answ=true;
          }

        }



        return answ;
    }


}
