import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int idx = 0;
        int sum = 0;
        int preNum = tangerine[0];
        
        Arrays.sort(tangerine);
        
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for(int i = 0; i < tangerine.length; i++) {
            if(preNum != tangerine[i]) { // 이전 수와 같지 않은 경우
                intArr.add(sum);
                
                sum = 1; // 합계 초기화
                preNum = tangerine[i]; // 이전 수 업데이트
                
                if(i == tangerine.length - 1) {
                    intArr.add(sum);
                }
            } else { // 이전 수와 같은 경우
                sum++;
                
                if(i == tangerine.length - 1) {
                    intArr.add(sum);
                }
            }
        }

        Collections.sort(intArr, Collections.reverseOrder());
        
        for(int i = 0; i < intArr.size(); i++) {
            if(intArr.get(i) >= k) {
                answer++;
                break;
            } else {
                k -= intArr.get(i);
                answer++;
            }
        }
        
        return answer;
    }
}