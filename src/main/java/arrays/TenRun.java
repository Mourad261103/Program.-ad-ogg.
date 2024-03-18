package arrays;

public class TenRun {
    public static int[] tenRun(int[] v)
    {
     int m=0;
     int s=0;
        for (int i = 0; i <v.length ; i++)
        {
            if(v[i]%10==0)
            {
                m=1;
                s=v[i];
            }
            if(v[i]%10!=0&&m==1)
            {
                v[i]=s;
            }
        }
        return v;
    }


}
