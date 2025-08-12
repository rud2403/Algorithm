/* 
1. s/n 을 한다
2. n의 길이만큼 s/n값을 채운다
3. s/n의 나머지 만


18/5
몫 3
나머지 3
3 3 3 3 3

*/ 
import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(s/n < 1) return new int[]{-1};
        
        int mok = s/n; // 몫
        int namerge = s%n; // 나머지
        
        for(int i = 0; i < n; i++) {
            answer[i] = mok;
        }
        
        for(int i = 0; i < namerge; i++) {
            answer[i] += 1;
        }
        
        Arrays.sort(answer);

        return answer;
            

    }
}