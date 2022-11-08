import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        my_string = my_string.replaceAll("[a-zA-z]", "");
        
        String[] strArr = my_string.split("");
        
        Arrays.sort(strArr);
        
        int[] intArr = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        return intArr;
    }
}