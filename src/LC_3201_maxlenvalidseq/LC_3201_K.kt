package LC_3201_maxlenvalidseq

import kotlin.math.max

class LC_3201_K {
    var even =0; var odd =0
    fun maximumLength(nums: IntArray): Int{
        var c = nums[0] % 2
        var odd = 0
        var even = 0
        var both = 0;
        for (num in nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (num % 2 == c) {
                both++;
                c = 1 - c;  // Toggle the parity
            }
        }
        return max(both, max(even, odd))
    }
}

fun main(){
    val obj = LC_3201_K()
    println(LC_3201_K().maximumLength(intArrayOf(1,2,1,1,2,1,2)))
    println(LC_3201_K().maximumLength(intArrayOf(2, 41, 32)))
    println(LC_3201_K().maximumLength(intArrayOf(41,33,22)))
    println(LC_3201_K().maximumLength(intArrayOf(41, 32, 13)))
    println(LC_3201_K().maximumLength(intArrayOf(1,2,3,4)))
    println(LC_3201_K().maximumLength(intArrayOf(1,3)))
    println(LC_3201_K().maximumLength(intArrayOf(4,51,68)))

}