import LC13_RomanToInteger.RomanToInteger_K
import LC14_LongestCommonPrefix.LongestCommonPrefix_K
import LC1_TwoSum.TwoSumK
import LC3_LongestSubstring.LongestSubstring_K
import LC5_LongestPallindromicString.LongestPallindromicString_K

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println()
    println(TwoSumK().twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(RomanToInteger_K().romanToInt("MCMXCIV"))

    val obj = LongestCommonPrefix_K()
    println(obj.longestCommonPrefix(arrayOf<String>("flower", "flow", "flight")))
    println(obj.longestCommonPrefix(arrayOf<String>("dog", "racecar", "car")))
    println(obj.longestCommonPrefix(arrayOf<String>("")))
    println(obj.longestCommonPrefix(arrayOf<String>(" ")))
    println(obj.longestCommonPrefix(arrayOf<String>(" ", "abcd", "abcd")))
    println(obj.longestCommonPrefix(arrayOf<String>(" ", "")))
    println(obj.longestCommonPrefix(arrayOf<String>(" ab", " abc")))
    LongestSubstring_K().output()

    LongestPallindromicString_K().printOutput()

}



