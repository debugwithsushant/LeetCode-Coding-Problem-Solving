// 53. Maximum Subarray

public class Day9 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Day9 day9 = new Day9();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = day9.maxSubArray(nums);
        
        System.out.println(result); // Output: 6
    }
}
