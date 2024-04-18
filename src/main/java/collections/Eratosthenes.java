package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n)
    {
        ArrayList<Integer> prim= new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            prim.add(i);
        }
        int s= (int) Math.sqrt(n);
        int l=2;
        int iteration=0;
        while (true)
        {
            if(iteration==s){break;}
            for (int i = 0; i < prim.size(); i++)
            {
                if (prim.get(i)%l==0 && prim.get(i)!=l )
                {
                    prim.remove(i);
                }
            }
            l++;
            iteration++;
        }
        return new HashSet<>(prim);
    }


}
