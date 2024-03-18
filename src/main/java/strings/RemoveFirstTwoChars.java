package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string)
    {
        StringBuilder str =new StringBuilder(string);
        str.delete(0,2);
        return String.valueOf(str);
    }
}
