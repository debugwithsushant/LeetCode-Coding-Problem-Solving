// 11. Container With Most Water

public class Day10 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int width = j - i;
            int tall = Math.min(height[i], height[j]);
            int currentArea = width * tall;

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Day10 day10 = new Day10();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = day10.maxArea(height);
        
        System.out.println(result); // Output: 49
    }
}
