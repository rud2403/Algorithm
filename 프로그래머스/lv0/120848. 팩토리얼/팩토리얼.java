class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul = 1;
        
        for(int i = 1; i <= 10; i++) {
            mul = 1;
            
            for(int j = 1; j <= i; j++) {
                mul *= j; 
            }
            
            if(mul == n) {
                answer = i;
            } else if (mul > n) {
                answer = i - 1;
                break;
            }
            
        }
        
        return answer;
    }
}