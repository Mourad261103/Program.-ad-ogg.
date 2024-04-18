package oop.collections;

import java.util.*;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src)
    {
        Map<String, Integer> invmap=new HashMap<>();
        Set<Integer> key=src.keySet();
        Collection<String> val=src.values();
        ArrayList<Integer> K=new ArrayList<>(key);
        ArrayList<String> V=new ArrayList<>(val);
        for (int i = 0; i < src.size(); i++) {
            invmap.put(V.get(i),K.get(i));
        }
        return invmap;
    }
}
