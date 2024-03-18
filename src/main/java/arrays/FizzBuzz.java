package arrays;

public class FizzBuzz
{
    public static String[] fizzBuzz(int start, int end)
    {
        String[] s=new String[end-1];
        for (int j=0,i = 1; j < end-1; i++,j++)
        {
            if(i%3==0)
            {
                s[j]="Fizz";
                continue;
            }
            else if (i%5==0)
            {
                s[j]="Buzz";
                continue;
            }
            s[j]=String.valueOf(i);

        }
        return s;
    }

}
