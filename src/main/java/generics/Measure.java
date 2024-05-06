package generics;

public class Measure {
    public static <T> T max(T[] array, Measurer<T> measurer)
    {
    T max=array[0];
        for (T t : array) {
            if(measurer.measure(t)>measurer.measure(max))
            {
                max=t;
            }
        }
        return max;
    }

    public static <T> T min(T[] array, Measurer<T> measurer)
    {
        T min=array[0];
        for (T t : array) {
            if(measurer.measure(t)<measurer.measure(min))
            {
                min=t;
            }
        }
        return min;

    }
    //con questa interfaccia facciamo diventare i gen dei double
    public interface Measurer<T>
    {
        double measure(T obj);
    }

}

