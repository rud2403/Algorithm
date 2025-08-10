class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int start = 0;
        int searchSize = t*m;
        String searchNum = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder answerStr = new StringBuilder();
        
        while(sb.length() < searchSize) {
            
            searchNum = Integer.toString(start, n);
            sb.append(searchNum);
            
            start++;
        }
        
        for(int i=p-1; i<searchSize; i+=m) {
            answerStr.append(sb.charAt(i));
        }
        
        return answerStr.toString().toUpperCase();
    }
}