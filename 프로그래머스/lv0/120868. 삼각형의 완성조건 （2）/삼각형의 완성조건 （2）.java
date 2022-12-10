class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int other = max == sides[0] ? sides[1] : sides[0];
        for(int i = 1; i <= max; i++) {
            if(other + i > max) {
                answer += 1;
            }
        }
        
        for(int i = max + 1; i < max + other; i++) {
            answer += 1;
        }
        return answer;
    }
}