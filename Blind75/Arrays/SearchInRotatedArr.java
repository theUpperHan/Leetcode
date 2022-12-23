class SearchInRotatedArr {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[left]) { //left has no rotation
                //target on left/right
                if (target < nums[mid] && target >= nums[left]) right = mid - 1; //target in non-rotated
                else left = mid + 1;
            }
            else { //right has no rotation
                if (target > nums[mid] && target <= nums[right]) left = mid + 1; //target in non-rotated
                else right = mid - 1;
            }
        }

        return Integer.MIN_VALUE;
    }
}
