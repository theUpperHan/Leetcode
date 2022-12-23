class ContainMostWater {
    public int maxWater(int[] nums) {
        int left = 0, right = nums.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(right, left);
            maxArea = Math.max(maxArea, width * height);

            if (nums[left] <= nums[right]) left++;
            else right--;
        }

        return maxArea;
    }    
}
