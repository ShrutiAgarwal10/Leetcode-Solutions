package LC13_RomanToInteger;

public class RomanToInteger {
    public int romanToInt(String s) {
        int l = s.length();
        int answer = values(s.charAt(l-1));
        for(int i = l-1; i>= 1; i--){
            int ch1 = values(s.charAt(i));
            int ch2 = values(s.charAt(i-1));
            if(ch2 < ch1){
                answer -= ch2;
            }else answer += ch2;
        }
        return answer;
    }


    public int values(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + ch);
        };
    }

    public static void main(String[] args){
        RomanToInteger rt = new RomanToInteger();
        System.out.println(rt.romanToInt("LVIII"));
    }
}
