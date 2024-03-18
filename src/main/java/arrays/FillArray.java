package arrays;

import java.util.Arrays;
import java.util.Random;

public class FillArray
{

    public static double[] fillArray(int size, double value, boolean addNoise)
    {
         double[] newarr= new double[size];
         if(addNoise)
         {
             Random generator= new Random();
             for (int i = 0; i < size; i++) {
                 newarr[i]=generator.nextDouble(value-5*value/100,value+5*value/100);
             }
         }
         else
         {
             Arrays.fill(newarr,value);
         }
         return newarr;
    }
    public static void main(String[] args)
    {


        double[] s=fillArray(3,1,true);
    }

}
