package LC_6_ZigZagConversion

class ZigZagConversion_K_M2 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        val rows = Array(numRows) { StringBuilder() }
        var currRow = 0
        var goingDown = false

        for (char in s) {
            rows[currRow].append(char)

            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown
            }

            currRow += if (goingDown) 1 else -1
        }

        return rows.joinToString("") { it.toString() }
    }
}
fun main(){
    val obj = ZigZagConversion_K_M2()
    println(obj.convert("PAYPALISHIRING", 3))
    println(obj.convert("PAYPALISHIRING", 4))
    println(obj.convert("PAYPALISHIRING", 5))
    println(obj.convert("PAYPALISHIRING", 6))
    println(obj.convert("PG", 3))
    println(obj.convert("PG", 2))
    println(obj.convert("PAYP", 3))
}