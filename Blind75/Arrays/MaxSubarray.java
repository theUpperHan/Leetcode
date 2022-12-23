class MaxSubarray {
    public int maxSubarray(int[] nums) {
        int current_subarr = nums[0];
        int maximum_subarr = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            current_subarr = Math.max(current_subarr, current_subarr + num);
            maximum_subarr = Math.max(current_subarr, maximum_subarr);
        }

        return maximum_subarr;
    }
}
