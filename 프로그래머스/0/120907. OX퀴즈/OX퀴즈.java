class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] strSl = quiz[i].split("= ");
            
            int num1 = 0;
            int num2 = 0;
            int ans = 0;
            
            if(strSl[1].contains("-")) {
                ans -= Integer.valueOf(strSl[1].split("-")[1]);
            } else {
                ans = Integer.valueOf(strSl[1]);
            }
            
            String[] strSl2 = strSl[0].split(" ");
            
            if("-".equals(strSl2[1])) {
                if(ans == Integer.valueOf(strSl2[0]) - Integer.valueOf(strSl2[2])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(ans == Integer.valueOf(strSl2[0]) + Integer.valueOf(strSl2[2])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        
        
        return answer;
    }
}