package LC14_LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * if any string is empty = return ""
 * Get the smallest word = smallest // sort and find first for smallest
 * Run a loop from 0 to length of smallest word in array = j
 * run a loop on all words from second of array: st
 * if(st.charAt(j) == smallest(j)) count ++
 * charAt(j) for all sub should be same = yes :
 *      if(count == length of array) = add to prefix
 *      if not same = return prefix
 */

public class LongestCommonPrefix {
    //9 ms
    public String longestCommonPrefix_M2(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        //Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        String prefix = "";
        if(strs[0].isEmpty()) return prefix;
        String smallest = strs[0];
        int lengthOfSmallest = smallest.length();
        for(int i=0; i<lengthOfSmallest; i++){
            char ch = smallest.charAt(i);
            int count = 0;
            for(int j = 1; j< strs.length; j++) {
                if(strs[j].charAt(i) == ch){
                    count++;
                }
            }
            if(count == strs.length - 1){
                prefix += ch;
            } else return prefix;
        }
        return prefix;
    }
    //0ms
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    prefix = "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(obj.longestCommonPrefix(new String[]{""}));
        System.out.println(obj.longestCommonPrefix(new String[]{" "}));
        System.out.println(obj.longestCommonPrefix(new String[]{" ", "abcd", "abcd"}));
        System.out.println(obj.longestCommonPrefix(new String[]{" ", ""}));
        System.out.println(obj.longestCommonPrefix(new String[]{" ab", " abc"}));
    }

}
