// 238. Product of Array Except Self

public class Day20 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = result[i-1] *nums[i-1];
        }

        int mul = 1;
        for(int i = n-1; i >= 0; i--) {
            result[i] = result[i] * mul;
            mul *= nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Day20 day20 = new Day20();
        int[] nums = {1, 2, 3, 4};
        int[] result = day20.productExceptSelf(nums);
        for(int num : result) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6
    }
}
