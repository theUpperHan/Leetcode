package Blind75;

import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length); //limit memory use
        
        for (Integer i : nums) {
            if (set.contains(i)) return true; //O(1) searching
            set.add(i);
        }

        return false;
    }    
}
