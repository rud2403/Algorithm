class Solution {
    public String solution(String s) {
        
        boolean tf = false; // 이전 문자가 공백인지 판별
        StringBuilder sb = new StringBuilder();
        
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ' ') { // 문자가 띄어쓰기일 때
                sb.append(s.charAt(i));
                tf = true;
            } else { // 문자가 일반 문자 일 때
                if(tf) { // 이전 문자가 띄어쓰기였을 때
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    tf = false;
                } else { // 이전 문자가 띄어쓰기가 아니었을 때
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        
        return sb.toString();
    }
}