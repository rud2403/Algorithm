class Solution {
    public String solution(String my_string, int n) {
        
        String[] strArr = my_string.split("");
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for (String str : strArr) {
            for(int i = 0; i < n; i++){
                stringBuilder.append(str);
            }
        }
        
        String answer = stringBuilder.toString();
        return answer;
    }
}