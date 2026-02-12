// 31. Next Permutation

public class Day15 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;

        for (int i = n-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint != -1) {
            for (int i = n-1; i > breakPoint; i--) {
                if (nums[i] > nums[breakPoint]) {
                    int temp = nums[breakPoint];
                    nums[breakPoint] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }

            reverse(nums, breakPoint+1, n-1);
        } else {
            reverse(nums, 0, n-1);
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Day15 day15 = new Day15(); 
        int[] nums = {1, 2, 3}; 
        
        day15.nextPermutation(nums); 
        
        for (int num : nums) { 
            System.out.print(num + " "); 
        }
    }
}
