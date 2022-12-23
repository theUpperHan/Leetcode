class findMinimum {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];

        int left = 0, right = nums.length - 1;

        //NO rotations
        if (nums[right] > nums[left]) return nums[left];

        //rotated
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //mid is the largest
            if (nums[mid] > nums[mid+1]) return nums[mid+1];
            //mid is the smallest
            if (nums[mid] < nums[mid-1]) return nums[mid];

            //binary search
            if (nums[mid] > nums[left]) left = mid + 1;
            else right = mid - 1;
        }

        return Integer.MIN_VALUE;

    }    
}
