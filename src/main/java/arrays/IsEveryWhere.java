package arrays;

public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value) {
        boolean ans = true;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != value && v[i + 1] != value) {
                ans = false;
            }
        }
        return ans;
    }

}
