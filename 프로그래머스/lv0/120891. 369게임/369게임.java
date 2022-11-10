import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] strArr = str.split("");
        
        for(String tempStr : strArr){
            System.out.println(tempStr);
            if(tempStr.equals("3") || tempStr.equals("6") || tempStr.equals("9")){
                answer ++;
            }
        }
        
        return answer;
    }
}