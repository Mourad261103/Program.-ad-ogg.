package arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v)
    {
        for (int j=v.length; j!=0; j--)
        {
            for (int k = 0; k < j-1 ; k++)
            {
                if(v[k]==0)
                {
                    int tmp=v[k+1];
                    v[k+1]=v[k];
                    v[k]=tmp;
                }
            }


        }
        return v;
    }

}
