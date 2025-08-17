import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strs = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strs[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strs, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(strs[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : strs) sb.append(str);
        
        return sb.toString();
    }
}