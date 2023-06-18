class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow; // 전체 격자의 수
        
        // 가로 길이와 세로 길이의 범위를 지정
        int width = 3;
        int height = total / width;
        
        while(width <= height) {
            int yellowTiles = (width - 2) * (height -2); // 노란색 격자의 개수
            
            // 노란색 격자의 개수가 주어진 값과 일치하면 정답
            if(yellowTiles == yellow) {
                answer[0] = height;
                answer[1] = width;
                break;
            }
            
            // 노란색 격자의 개수가 주어진 값과 일치하지 않는 경우 가로 길이와 세로길이를 증가시킴
            width++;
            height = total / width;
        }
        
        return answer;
    }
}