import java.util.*;

class TwoSum {
    /* Hash table searching time == O(1)
       Brute force requires 2 loops, hashmap
       elinminates the inner for loop down to a quick hash table search
     */

    public int[] TwoSumSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //O(1) searching

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //get complement

            if (map.containsKey(complement)) 
                return new int[] {map.get(complement), i};

            map.put(nums[i], i); //not found -> add to map
        }

        return null;
    }
}