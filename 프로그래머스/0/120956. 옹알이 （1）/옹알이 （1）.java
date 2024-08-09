class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling) {
            
            String strTemp = str;
            
            for(String str2 : strArr) {
                
                if(strTemp.indexOf(str2) > -1) {
                    strTemp = strTemp.replace(str2, " ");
                }
            }
            
            if(strTemp.trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}