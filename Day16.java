// 56. Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day16 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i =1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart <= end) {
                end = Math.max(end, currentEnd);
            } else {
                merged.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

        merged.add(new int[]{start, end});

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Day16 day16 = new Day16(); 
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}}; 
        
        int[][] result = day16.merge(intervals); 
        
        for (int[] interval : result) { 
            System.out.println(Arrays.toString(interval)); 
        }
    }
}
