package strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string)
    {
        boolean a=false;
        if (string.charAt(0)=='g')
        {
            a= string.startsWith("good");
        }
        if (string.charAt(1)=='g')
        {
            a= string.startsWith("good",1);
        }
        return a;
    }
}
