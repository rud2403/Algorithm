import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        // 1. 분모 분자의 최대 공약수 구하기
        int gcd = gcd(a, b);
        
        // 2. 분모 소인수 분해
        b = b / gcd; // 분모를 최대 공약수로 나누기
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= b; i++) {
            if(b >= 2) {
                while(b % i == 0) {
                    list.add(i);
                    b = b / i;
                }
                
            }
        }
        
        for(Integer num : list){
            if(num != 2 && num != 5) {
                answer = 2;
            }
        }
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}