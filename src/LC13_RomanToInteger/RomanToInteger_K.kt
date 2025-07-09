package LC13_RomanToInteger

//Time Comp = O(N)
//Space comp = O(1)
class RomanToInteger_K {
    fun romanToInt(s: String): Int {
        val l = s.length
        var ans = values(s[l-1])
        for(i in l-1 downTo 1 ){
            val ch1 = values(s[i])
            val ch2 = values(s[i-1])
            if(ch2 < ch1)
                ans -= ch2
            else ans += ch2
        }
        return ans
    }

    fun values(ch: Char) : Int {
        return when(ch){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalStateException("Unexpected value: $ch")
        }
    }
}