import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= n; i++) numbers.add(i);
        
        int[] answer = new int[n];
        long fact = 1;
        
        for(int i = 1; i <= n; i++) fact *= i; // n! 구하기
        
        k--;
        
        for(int i = 0; i < n; i++) {
            fact /= (n - i);
            int index = (int)(k / fact);
            answer[i] = numbers.get(index);
            numbers.remove(index);
            k %= fact;
        }
        return answer;
    }
}