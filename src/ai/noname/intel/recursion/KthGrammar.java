package ai.noname.intel.recursion;

public class KthGrammar {
    public int kthGrammar(int n, int k) {
        int i = 1;
        int[] result = new int[n];
        result[0]=0;
        while (i <= n-1) {
            int m = result[i - 1];
            int z = m % 10;
            StringBuilder sb = new StringBuilder("0");

            while (z != m||m==0) {
                if (z == 0) {
                    sb.append("01");
                } else {
                    sb.append("10");
                }
                m = m / 10;
                z = m % 10;
            }
            result[i] = Integer.parseInt(sb.toString());
            if (i == k)
                return result[i];
            i++;
        }
        return 0;
    }
}
