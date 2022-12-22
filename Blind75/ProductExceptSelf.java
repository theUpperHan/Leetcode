package Blind75;

import java.util.*;

class ProductExceptSelf {
    public int[] OnSpace(int[] nums) {
        int len = nums.length;

        int[] answer = new int[len];

        answer[0] = 1;
        for (int i = 0; i < len; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        int R = 1;
        for (int i = len - 1; i >= 0; i--) {
            answer[i] = R * answer[i];
            R *= nums[i];
        }

        return answer;
    }
}