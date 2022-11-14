class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] strArr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strArr.length; i++) {
            if(i >= 1 && i % code == 0) {
                sb.append(strArr[i - 1]);
            }
        }
        
        if(strArr.length % code == 0) {
            sb.append(strArr[strArr.length - 1]);
        }
        
        return sb.toString();
    }
}