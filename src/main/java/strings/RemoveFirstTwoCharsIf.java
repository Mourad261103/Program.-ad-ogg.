package strings;

public class RemoveFirstTwoCharsIf
{
    public static String removeFirstTwoCharsIf(String string)
    {
        StringBuilder str=new StringBuilder(string);
        int s=string.length();
        if (string.startsWith("H")&&string.charAt(1)=='e')
        {
        return string;
        } else if(string.startsWith("H")&&string.charAt(1)!='e')
        {
            str.deleteCharAt(1);
            string=String.valueOf(str);
            return string;
        }
        else if(string.charAt(0)!='H'&&(s==1||string.charAt(1)=='e'))
        {
            str.deleteCharAt(0);
            string=String.valueOf(str);
            return string;
        }
        str.delete(0,2);
        string=String.valueOf(str);
        return string;
    }


}



