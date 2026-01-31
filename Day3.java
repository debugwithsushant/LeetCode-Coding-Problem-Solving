// 169. Majority Element

// import java.util.Arrays;

class Day3{
    // Optimized Approach: Sorting
    // public int majorityElement(int[] nums) {

    //     Arrays.sort(nums);
    //     int count = 1;
    //     int ans = nums[0];

    //     for (int i = 1; i < nums.length; i++) {

    //         if (nums[i] == nums[i - 1]) {
    //             count++;
    //         } else {
    //             count = 1;
    //             ans = nums[i];
    //         }
            
    //         if (count > nums.length / 2) {
    //             return ans;
    //         }
    //     }
    //     return -1;
    // }

    // Optimal Approach: Moore's Voting Algorithm
    public int majorityElement(int[] nums) {

        int freq = 0;
        int ans = 0;

        for (int num : nums) {
            if(freq == 0) {
                ans = num;
            }
            if(ans == num) {
                freq++;
            } else {
                freq--;
            }
        }

        int count = 0;
        for (int num : nums) {
            if(ans == num) {
                count++;
            }
        }

        if(count > nums.length / 2) {
            return ans;
        }
        return -1;
    }


    public static void main(String[] args) {
        Day3 day3 = new Day3();
        int[] nums = {3,2,3};
        System.out.println(day3.majorityElement(nums)); // Output: 3    
    }
}