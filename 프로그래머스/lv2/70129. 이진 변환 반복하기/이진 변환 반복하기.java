class Solution {
    
    static int[] answer = {0, 0};
    static String str;
    
    
    public int[] solution(String s) {
        
        str = s;
        
        while(!"1".equals(str)) {
            remo(str);
        }
        
        return answer;
    }
    
    public static void remo(String s) {

        
        if(s.contains("0")) { // 0이 포함된 경우 제거

            answer[1] += s.length() - s.replace("0", "").length(); // 제거한 0의 개수

            str = Integer.toBinaryString(s.replace("0", "").length()); // 0을 제거한 문자 길이 수의 2진법

            answer[0]++;

        } else { // 0이 포함되지 않은 경우
            str = Integer.toBinaryString(s.length());

            answer[0]++;
        } 
    }
}