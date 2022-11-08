class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String[] strArr = rsp.split("");
        
        for(String str : strArr) {
            if(str.equals("2")){
                sb.append("0");
            } else if(str.equals("0")) {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }
        
        return sb.toString();
    }
}