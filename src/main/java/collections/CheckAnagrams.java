package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second)
    {
        ArrayList<Character> F= new ArrayList<>();
        ArrayList<Character> S=new ArrayList<>();
        for (char c : first.toCharArray())
        {
            F.add(c);
        }
        for (char c : second.toCharArray())
        {
            S.add(c);
        }
        for (int i = 0; i < first.length(); i++) {
         if(!F.contains(S.get(i)))
         {
             return false;
         }
        }
        return true;
    }


}
