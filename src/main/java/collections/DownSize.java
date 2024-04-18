package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownSize {

    public static void downsize1(List<String> list, int n)
    {
        if (n==1)
        {
         list.clear();
        }
        else {
            for (int i = 1, x = 0; x < list.size(); i++, x++) {
                if (i == n) {
                    list.remove(x);
                    i = 1;
                }
            }
        }
    }
    public static void downsize(List<String> list, int n)
    {
      int index=0;
      for (Iterator<String> l = list.iterator();l.hasNext();)
      {
          index++;
          l.next();
          if(index%n==0)
          {
              l.remove();
          }
      }

    }


}
