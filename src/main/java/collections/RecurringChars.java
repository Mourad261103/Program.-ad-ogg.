package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string)
    {
    Set<Character> stringnodup =new HashSet<>();
    Set<Character> dup =new HashSet<>();
    char[] s=string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
        if(!stringnodup.add(s[i]))
        {
            dup.add(s[i]);
        }
        }
        return dup;
    }


}
