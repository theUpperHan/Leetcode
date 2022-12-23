class ProductExceptSelf {
    public int[] OnSpace(int[] nums) {
        //left product * right product = product except self
        int len = nums.length;

        int[] answer = new int[len];

        //initial answer array as `left product`
        answer[0] = 1;
        for (int i = 0; i < len; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        //save memory by eliminates the `right product`
        //directly modify the answer array
        int R = 1;
        for (int i = len - 1; i >= 0; i--) {
            answer[i] = R * answer[i];
            R *= nums[i];
        }

        return answer;
    }
}