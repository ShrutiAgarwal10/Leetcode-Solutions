package LC5_LongestPallindromicString

import kotlin.math.max

class LongestPallindromicString_K {
    fun longestPalindrome(s: String): String {
        var start = 0;
        var end = 0;
        for (i in s.indices) {
            val len1 = growFromCenter(s, i, i)
            val len2 = growFromCenter(s, i, i + 1);
            val len = max(len1, len2)
            if (len > end - start) {
                start = i - (len - 1) / 2
                end = i + len / 2
            }
        }
        return s.substring(start, end + 1)
    }


    fun growFromCenter(s: String, l: Int, r: Int): Int {
        var left = l;
        var right = r;
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--
            right++
        }
        return right - left - 1
    }

    fun printOutput() {
        val input: Array<String> = arrayOf<String>(
            "babad",
            "daadb",
            "cbbd",
            "aba",
            "a",
            "aaa",
            "252",
            "3223",
            "3aa3",
            "101",
            "eabcb"
        )
        for (i in input.indices) {
            println("${input[i]} = ${longestPalindrome(input[i])}")
        }
    }
}