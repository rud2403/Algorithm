class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.split("");
        for(int i = strArr.length - 1; i >= 0; i--){
            sb.append(strArr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}