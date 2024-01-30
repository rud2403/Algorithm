import java.util.*;


class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int stx = 51;
        int sty = 51;
        int edx = 0;
        int edy = 0;
        
        // 배열 첫번 째 수 넣기
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    stx = Math.min(stx, i);
                    sty = Math.min(sty, j);
                    edx = Math.max(edx, i);
                    edy = Math.max(edy, j);
                }
            }
        }
        answer[0] = stx;
        answer[1] = sty;
        answer[2] = edx + 1;
        answer[3] = edy + 1;
        
        return answer;
    }
}