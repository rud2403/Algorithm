import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        String[] strArr = my_string.split("");
        
        Arrays.sort(strArr);
        
        String answer = String.join("", strArr);;
        return answer;
    }
}