// 560. Subarray Sum Equals K

public class Day21 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += nums[j];
                if(sum == k) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Day21 solution = new Day21();
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = solution.subarraySum(nums, k);
        System.out.println(result); // Output: 2
    }
}
