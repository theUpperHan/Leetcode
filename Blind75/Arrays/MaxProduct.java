class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int curr_max = nums[0];
        int curr_min = nums[0];
        int max_product = curr_max;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int temp_max = Math.max(num, Math.max(num*curr_max, num*curr_min));
            curr_min = Math.min(num, Math.min(num*curr_max, num*curr_min));

            curr_max = temp_max;

            max_product = Math.max(max_product, temp_max);
        }

        return max_product;
    }
}
