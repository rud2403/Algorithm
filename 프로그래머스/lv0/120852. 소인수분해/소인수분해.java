import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        
        int num = 2;
        Set<Integer> set = new LinkedHashSet<Integer>();

        while(n >= num){
            if(n % num == 0) {
                n /= num;
                set.add(num);
            } else {
                num ++;
            }
        }
        
        Integer[] answer = set.toArray(new Integer[0]);
        
        
        return answer;
    }
}