// 75. Sort Colors

public class Day11 {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                default -> {
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Day11 day11 = new Day11();
        int[] nums = {2, 0, 2, 1, 1, 0};

        day11.sortColors(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
