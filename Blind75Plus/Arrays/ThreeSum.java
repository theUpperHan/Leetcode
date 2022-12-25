import java.util.*;

class ThreeSum {
    public void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int left = i + 1, right = nums.length - 1;

        //left cannot equal to right becuase addends be duplicate
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            //binary search
            if (sum < 0) {
                left++;
            }
            else if (sum > 0) {
                right--;
            }
            else { //matched -> add to List
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));

                //move left to prevent duplicate results
                while (left < right && nums[left] == nums[left - 1])
                    left++;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //sort for binary search
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        //if current number greater than 0, since it's a sorted array
        //the rest element on the right cannot add up to 0 -> skip
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            
            //eliminate duplicates
            //i==0 for edge case
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, res);
            }
        }

        return res;
    }
}
