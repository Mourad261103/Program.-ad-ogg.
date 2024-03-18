package strings;

public class SumDigits {
    public static int sumDigits(String string)
    {
      char[] str=string.toCharArray();
      int i=0;
      int n=0;
        for (int j = 0; j <str.length ; j++)
        {
           n=Character.digit(str[j],9);
            if(n!=-1)
            {
                i=i+n;
            }
        }
       return i;
    }

}
