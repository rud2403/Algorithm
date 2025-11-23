import java.util.*;

class Solution {
    public String intToRoman(int num) {
        // 값과 심볼을 큰 순서대로 나열
        int[] values = {
            1000, 900, 500, 400,
            100,  90,  50,  40,
            10,   9,   5,   4,
            1
        };

        String[] symbols = {
            "M",  "CM", "D", "CD",
            "C",  "XC", "L", "XL",
            "X",  "IX", "V", "IV",
            "I"
        };

        StringBuilder sb = new StringBuilder();

        // 가장 큰 값부터 내려오면서 해당 값이 num에 몇 번 들어가는지 처리
        for(int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }         
        }

        return sb.toString();
    }
}