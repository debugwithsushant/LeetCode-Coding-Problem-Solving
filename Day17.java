// 3. Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;

public class Day17 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);

            while(set.contains(currChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currChar);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Day17 day17 = new Day17(); 
        String s = "abcabcbb"; 
        
        int result = day17.lengthOfLongestSubstring(s); 
        
        System.out.println(result); 
    }
}
