class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        String x = strArr[num1];
        String y = strArr[num2];
        
        strArr[num1] = y;
        strArr[num2] = x;
        
        for(String str : strArr) {
            System.out.println(str);
            sb.append(str);
        }
        
        return sb.toString();
    }
}