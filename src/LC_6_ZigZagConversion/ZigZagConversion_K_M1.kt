package LC_6_ZigZagConversion

class ZigZagConversion_K_M1 {
    fun convert(s: String, numRows: Int): String {
        if(numRows == 1) return s
        val len = s.length
        val col = calculateColumns(len, numRows)
        val matrix : Array<CharArray> = Array<CharArray>(numRows) { CharArray(col) {' '} }
        return buildMatrix(s, numRows, col, matrix)
    }
    fun buildMatrix(s : String, rows: Int, col: Int, matrix : Array<CharArray>) : String{
        var x = 0
        var i=0
        var j =0
        while( x < s.length && j < col ){
            for(i in 0..rows-1){
                if(x>=s.length || j >= col) break
                matrix[i][j] = s[x++]
            }
            for( i in rows-2 downTo 1){
                if(x >= s.length || j >= col) break
                ++j
                matrix[i][j] = s[x++]
            }
            ++j
        }

        val result = StringBuilder()
        for (r in 0 until rows) {
            for (c in 0 until col) {
                if (matrix[r][c] != ' ') {
                    result.append(matrix[r][c])
                }
            }
        }

        return result.toString()
    }
    fun calculateColumns(l : Int, rows : Int) : Int {
        if(l<=rows) return 1
        val cycleLen = 2 * rows - 2
        val cols = (l / cycleLen + 1) * (rows - 1)
        return cols
    }

}
fun main(){
    val obj = ZigZagConversion_K_M1()
    println(obj.convert("PAYPALISHIRING", 3))
    println(obj.convert("PAYPALISHIRING", 4))
    println(obj.convert("PAYPALISHIRING", 5))
    println(obj.convert("PAYPALISHIRING", 6))
    println(obj.convert("PG", 3))
    println(obj.convert("PG", 2))
    println(obj.convert("PAYP", 3))
}