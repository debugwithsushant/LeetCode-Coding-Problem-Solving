// 136. Single Number

public class Day6 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        Day6 day6 = new Day6();

        int[] nums = {4, 1, 2, 1, 2};
        int result = day6.singleNumber(nums);
        
        System.out.println(result);
    }
}
