import java.util.*;
/**
 1. k진법으로 n숫자 변경
 2. 소수 탐색
**/
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n, k);
        
        // 0을 기준으로 split
        String[] str = num.split("0");
        
        for(String s : str) {
            if(!s.equals("") && isPrime(Long.parseLong(s))) answer++;
        }
            
        
        return answer;
    }
    
    public boolean isPrime(Long n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}