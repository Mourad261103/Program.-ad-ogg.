package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence)
    {
        ArrayDeque<String> l =new ArrayDeque<>();
        for (Iterator<String> i = sentence.iterator(); i.hasNext();) {
            l.addFirst(i.next());
        }
        return l.stream().toList();

    }

}
