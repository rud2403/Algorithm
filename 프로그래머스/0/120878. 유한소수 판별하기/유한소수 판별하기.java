import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        // 1. 분모 분자의 최대 공약수 구하기
        int gcd = gcd(a, b);
        
        // 2. 분모 소인수 분해
        b = b / gcd; // 분모를 최대 공약수로 나누기
        
        while(b % 2 == 0) {
            b /= 2;
            System.out.println("b /= 2: " + b);
        }
        
        while(b % 5 == 0) {
            b /= 5;
            System.out.println("b /= 5: " + b);
        }
        
        return b == 1 ? 1 : 2;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}