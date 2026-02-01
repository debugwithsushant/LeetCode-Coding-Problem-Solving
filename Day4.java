// 2965. Find Missing and Repeated Values

class Day4 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n + 1;
        int[] freq = new int[N];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int[] ans = new int[2]; // ans[0] = Twice, ans[1] = miss

        for (int i = 1; i < N; i++) {
            if (freq[i] == 2) {
                ans[0] = i;
            } else if (freq[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Day4 day4 = new Day4();

        int[][] grid = {{9, 1, 7}, {8, 9, 2}, {3, 6, 4}};
        int[] result = day4.findMissingAndRepeatedValues(grid);
        
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}