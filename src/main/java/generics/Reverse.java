package generics;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list)
    {
        List<T> l=new ArrayList<>(list);
        for (int i = 0; i < Math.floor(list.size()/2); i++) {
            T tmp=list.get(i);
            list.set(i,list.get(l.size()-i-1));
            list.set(l.size()-i-1, tmp);
        }
    }
}
