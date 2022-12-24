public class CountBits {
    public int countOne(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n-1);
        }
        return sum;
    }

    public int[] CountBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i < res.length; i++) {
            res[i] = countOne(i);
        }
        return res;
    }
}
