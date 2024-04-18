package collections;

import javax.print.attribute.SetOfIntegerSyntax;
import java.awt.List;
import java.util.*;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> l=new HashSet<>(first);
        for (Iterator<Integer> i = second.iterator(); i.hasNext();)
        {
            int num=i.next();
            l.add(num);
        }
        return l;
    }

    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> l= new HashSet<>(first);
        l.addAll(second);
        return l;
    }

    public static void main(String[] args) {
        int g=0;
        Set<Integer> i= unionAddAll(Set.of(1, 2, 3), Set.of(4, 5, 6));
    }
}
