package LC9_PalindromeNumber

class PalindromeNum_K {
    fun isPalindrome(x: Int): Boolean {
        var copy = x
        var rev = 0
        while(copy > 0){
            rev = rev*10 + (copy % 10)
            copy = copy / 10
        }
        return rev==x
    }
}