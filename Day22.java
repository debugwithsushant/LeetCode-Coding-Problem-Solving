// 287. Find the Duplicate Number

public class Day22 {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];

        for(int num : nums) {
            freq[num]++;
        }

        for(int i = 0; i < nums.length; i++) {
            if(freq[i] >= 2) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        Day22 day22 = new Day22();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(day22.findDuplicate(nums));
    }
}