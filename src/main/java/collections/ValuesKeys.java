package collections;

import java.util.*;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map)
    {
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
       ArrayList<String> K=new ArrayList<>(keys);
        ArrayList<String> V=new ArrayList<>(values);
        for (int i = 0; i < K.size(); i++) {
            if(K.contains(V.get(i)))
            {
                return true;
            }
        }
        return false;
    }

}
