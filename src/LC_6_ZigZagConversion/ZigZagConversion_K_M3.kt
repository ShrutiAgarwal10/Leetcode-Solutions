package LC_6_ZigZagConversion

class ZigZagConversion_K_M3 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || numRows >= s.length) {
            return s
        }

        val result = StringBuilder()
        val toSkip = 2 * (numRows - 1)

        for (row in 0 until numRows) {
            var i = row
            while (i < s.length) {
                result.append(s[i])
                val cycleLen = 2 * (numRows - 1)
                val j = i + cycleLen - 2 * row
                if (row != 0 && row != numRows - 1 && j < s.length) {
                    result.append(s[j])
                }
                i += toSkip
            }
        }

        return result.toString()
    }
}
fun main(){
    val obj = ZigZagConversion_K_M3()
    println(obj.convert("PAYPALISHIRING", 3))
    println(obj.convert("PAYPALISHIRING", 4))
    println(obj.convert("PAYPALISHIRING", 5))
    println(obj.convert("PAYPALISHIRING", 6))
    println(obj.convert("PG", 3))
    println(obj.convert("PG", 2))
    println(obj.convert("PAYP", 3))
}