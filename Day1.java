//3005. Count Elements With Maximum Frequency
class Day1 {
    public int maxFrequencyElements(int[] nums) {

        int maxFreq = 0;
        int result = 0;
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++){
            
            if(visited[i]) continue;
            int count = 1;

            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    visited[j] = true;
                }
            }

            if(count > maxFreq){
                maxFreq = count;
                result = count;
            } else if(count == maxFreq){
                result += count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Day1 obj = new Day1();
        int[] nums1 = {1,2,2,3,1,4};
        System.out.println(obj.maxFrequencyElements(nums1)); // Output: 4

        int[] nums2 = {1,2,3,4,5};
        System.out.println(obj.maxFrequencyElements(nums2)); // Output: 5
    }
}

// Example 1:
// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.

// Example 2:
// Input: nums = [1,2,3,4,5]
// Output: 5
// Explanation: All elements of the array have a frequency of 1 which is the maximum.
// So the number of elements in the array with maximum frequency is 5.