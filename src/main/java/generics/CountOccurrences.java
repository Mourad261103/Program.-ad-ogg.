package generics;

import java.util.Arrays;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item)
    {
        int cont=0;
        if(item==null)
        {
            for (T t : src) {
                if(t==null)
                {
                    cont++;
                }
            }
        }
        else
        {
            for (T t : src) {
                if(t!=null&&t.equals(item))
                {
                    cont++;
                }
            }
        }
        return cont;
    }
}
