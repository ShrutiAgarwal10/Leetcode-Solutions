package LC9_PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int copy = x;
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        return copy == rev;
    }
}
