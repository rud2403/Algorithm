class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int answer = 0;
        
        String[] strArr = str.split("");
        
        for(String s : strArr) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}