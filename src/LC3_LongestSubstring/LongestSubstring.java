package LC3_LongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args){
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(ls.lengthOfLongestSubstring("bbbbb"));
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
        System.out.println(ls.lengthOfLongestSubstring(""));
        System.out.println(ls.lengthOfLongestSubstring(" "));
        System.out.println(ls.lengthOfLongestSubstring("ab cbacb"));
        System.out.println(ls.lengthOfLongestSubstring("abcd cbacb"));
        System.out.println(ls.lengthOfLongestSubstring(" "));
        System.out.println(ls.lengthOfLongestSubstring("  "));
        System.out.println(ls.lengthOfLongestSubstring("abcd"));
        System.out.println(ls.lengthOfLongestSubstring(" abcd "));
        System.out.println(ls.lengthOfLongestSubstring("dvdf"));
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
