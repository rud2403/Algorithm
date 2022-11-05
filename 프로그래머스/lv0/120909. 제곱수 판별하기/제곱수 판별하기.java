class Solution {
    public int solution(int n) {
        
        double result = Math.sqrt(n);
        
        result = result - Math.floor(result);
        
        int answer = result != 0.0? 2 : 1;
        return answer;
    }
}