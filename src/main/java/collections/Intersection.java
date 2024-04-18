package collections;

import java.util.*;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second)
    {
    Set<Integer> l=new LinkedHashSet<>();
       for (Iterator<Integer> i= first.iterator();i.hasNext();)
       {
           int num=i.next();
           if(second.contains(num))
           {
            l.add(num);
           }
       }
    return l;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    public static void main(String[] args) {
        Intersection.intersectionRetainAll(Set.of(1, 2, 3), Set.of(3, 4, 5));
    }
}
