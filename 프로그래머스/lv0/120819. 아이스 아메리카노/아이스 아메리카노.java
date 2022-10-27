class Solution {
    public int[] solution(int money) {
        
        int x = money / 5500;
        int y = money % 5500;
        
        int[] answer = {x, y};
        return answer;
    }
}