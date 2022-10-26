class Solution {
    public int solution(int n) {
        int answer = n / 7;
        int x = n % 7;
        
        if(x > 0)  answer++;
        
        return answer;
    }
}