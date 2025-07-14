package LC3_LongestSubstring

import java.lang.Math.max


class LongestSubstring_K {
    fun output(){
        println(lengthOfLongestSubstring("abcabcbb"))
        println(lengthOfLongestSubstring("bbbbb"))
        println(lengthOfLongestSubstring("pwwkew"))
        println(lengthOfLongestSubstring(""))
        println(lengthOfLongestSubstring(" "))
        println(lengthOfLongestSubstring("ab cbacb"))
        println(lengthOfLongestSubstring("abcd cbacb"))
        println(lengthOfLongestSubstring(" "))
        println(lengthOfLongestSubstring("  "))
        println(lengthOfLongestSubstring("abcd"))
        println(lengthOfLongestSubstring(" abcd "))
        println(lengthOfLongestSubstring("dvdf"))
    }
    fun lengthOfLongestSubstring(s: String): Int {
        val map : MutableMap<Char, Int> = mutableMapOf()
        var left = 0
        var maxLength = 0

        for((right,c) in s.withIndex()){
            if(map.containsKey(c) && map.getValue(c) >= left){
                left = map.getValue(c) + 1
            }
            map.put(c, right)
            maxLength = max(maxLength, right - left + 1)
        }
        return maxLength
    }
    fun lengthOfLongestSubstring2(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var left = 0
        var maxLength = 0

        for ((right, c) in s.withIndex()) {
            if (map.containsKey(c) && map[c]!! >= left) {
                left = map[c]!! + 1
            }

            map[c] = right
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}