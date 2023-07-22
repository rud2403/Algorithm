class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        String word = "";
        
        for(int i = 0; i < goal.length; i++) {
            word = goal[i];
            
            if(word.equals(cards1[idx1])) {
                if(idx1 < cards1.length - 1) {
                    idx1++;
                }
            } else if(word.equals(cards2[idx2])) {
                if(idx2 < cards2.length - 1) {
                    idx2++;
                }
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}