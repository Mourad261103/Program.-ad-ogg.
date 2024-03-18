package arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2)
    {
     double[] div =new double[v1.length];
        for (int i = 0; i < v1.length; i++)
        {
        div[i]=v1[i]/v2[i];
        }
        return div;
    }
}
