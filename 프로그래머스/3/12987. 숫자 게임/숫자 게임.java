import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int j = 0; // B의 투 포인터
        
        for(int i = 0; i < A.length && j < B.length; i++) {
            while(j < B.length && B[j] <= A[i]) {
                j++;
            }
            if(j < B.length) {
                answer++;
                j++;
            }
        }
        
        return answer;
    }
}