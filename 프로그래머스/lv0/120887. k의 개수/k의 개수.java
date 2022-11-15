import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            String str = Integer.toString(x);
            String[] strArr = str.split("");
            for(String s : strArr) {
                String kStr = Integer.toString(k);
                if(s.equals(kStr)) {
                    answer ++;
                }
            }
            
        }
        
        return answer;
    }
}