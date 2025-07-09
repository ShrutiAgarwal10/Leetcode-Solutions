package LC13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {

    public int romanToInt(String s) {
            Map<String, Integer> values = new HashMap<>();
            values.put("I", 1);
            values.put("V", 5);
            values.put("X", 10);
            values.put("L", 50);
            values.put("C", 100);
            values.put("D", 500);
            values.put("M", 1000);

            s = s.replace("IV", "IIII")
                    .replace("IX", "VIIII")
                    .replace("XL", "XXXX")
                    .replace("XC", "LXXXX")
                    .replace("CD", "CCCC")
                    .replace("CM", "DCCCC");

            int number = 0;

            for (int i = 0; i < s.length(); i++) {
                String current = String.valueOf(s.charAt(i));
                number += values.get(current);
            }

            return number;
    }

    public static void main(String[] args){
        RomanToInteger2 rt = new RomanToInteger2();
        System.out.println(rt.romanToInt("MCMXCIV"));
    }

}
