class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling) {
            
            if(b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                continue;
            }
            
            for(String a : strArr) {
                if(b.contains(a)) {
                    b = b.replace(a, " ");
                }                
            }
            
            b = b.replace(" ", "");
            
            if(b.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
} 