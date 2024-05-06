package generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key)
    {
        int start = 0, end = array.length - 1, centro = 0;
        while (start <= end)
        {
            centro = (start + end) / 2;
            if (key.compareTo(array[centro])<0)
            {
                end = centro - 1;
            }
            else
            {
                if (key.compareTo(array[centro])>0)
                    start = centro + 1;
                else
                    return centro; // Caso: elemento==array[centro]
            }
        }
        return -1;
    }
}
