package strings;

public class Concatenate {
    public static String concatenate(String[] strings)
    {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < strings.length ; i++)
        {
          str.append(strings[i]);
        }
        return String.valueOf(str);
    }


}
