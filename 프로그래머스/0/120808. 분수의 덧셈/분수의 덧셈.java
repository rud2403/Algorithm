class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num1 = numer1 * denom2 + numer2 * denom1;
        int num2 = denom1 * denom2;
        int gcd = gcd(num1, num2);
        
        answer[0] = num1 / gcd;
        answer[1] = num2 / gcd;
        
        return answer;
    }
    
    public static int gcd(int i, int j) {
        if(j == 0) return i;
        return gcd(j, i % j);
    }
}