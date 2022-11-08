import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        
        int[] intArr = list.stream()
                .mapToInt(i -> i)
                .toArray();
        answer = intArr;
        return answer;
    }
}