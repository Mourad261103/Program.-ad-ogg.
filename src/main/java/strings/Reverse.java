package strings;

public class Reverse
{
    public static String reverse(String string)
    {
     StringBuilder str = new StringBuilder(string);
     str.reverse();
     return String.valueOf(str);
    }

}
