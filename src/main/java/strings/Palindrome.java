package strings;

public class Palindrome {
    public static boolean isPalindrome(String string)
    {
        StringBuilder rev=new StringBuilder(string);
        StringBuilder str=new StringBuilder(string);
        rev.reverse();
        if(rev.compareTo(str)==0)
        {
            return true;
        }
        return false;
    }
}
