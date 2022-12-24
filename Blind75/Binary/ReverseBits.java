public class ReverseBits {
    public int reverseBits(int n) {
        if (n == 0) return 0;

        int res = 0;
        for (int i = 0; i < 32; i++) {
            //res left shift by one, leave space for later res++
            res <<= 1;
            //if the least significant bit is 1
            if ((n&1) == 1) res++;
            n >>= 1;
        }
        return res;
    }    
}
