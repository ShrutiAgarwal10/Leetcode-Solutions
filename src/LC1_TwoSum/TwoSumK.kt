package LC1_TwoSum

class TwoSumK {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val value = target - nums[i]
            if (map.contains(value)) return intArrayOf(map[value]!!, i)
            map[nums[i]] = i
        }
        return intArrayOf(0)
    }
}