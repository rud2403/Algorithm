class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if(common[1] - common[0] == common[2] - common[1]) { // 등차임
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else { // 등비임
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}