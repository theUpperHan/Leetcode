public class MissingNumber {
    public int missingNumber(int[] nums) {
        int expected_sum = nums.length * (nums.length + 1) / 2;
        int actual_sum = 0;
        for (int i : nums) actual_sum += i;
        return expected_sum - actual_sum;
    }
}
