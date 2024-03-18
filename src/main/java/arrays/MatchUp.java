package arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2)
    {
        int ndiff=0;
        for (int i = 0; i <v1.length ; i++) {
            int c=Math.abs(v1[i]-v2[i]);
            if(c<=2&&c!=0)
            {
                ndiff++;
            }

        }
        return ndiff;
    }
}
