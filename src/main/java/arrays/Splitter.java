package arrays;

public class Splitter {
    public static int[] splitter(int input)
    {
        int n=input;
        int s=0;

     while (n!=0)
     {
         s++;
         n=n/10;
     }
     int[] v=new int[s];

        for (int i = s-1; i >= 0; i--)
        {
            v[i]=input%10;
            input=input/10;
        }

     return v;
    }

}

