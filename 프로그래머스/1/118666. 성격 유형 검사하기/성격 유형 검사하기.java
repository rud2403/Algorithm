class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int R = 0;
        int T = 0;
        int C = 0;
        int F = 0;
        int J = 0;
        int M = 0;
        int A = 0;
        int N = 0;
        
        for(int i = 0; i < survey.length; i++) {
            // System.out.println("survey[i] : " +  survey[i]);
            // System.out.println("survey[i] : " +  survey[i].substring(0, 1));
            // System.out.println("----------------------------");
            
            String su = survey[i].substring(0, 1);
            int score = choices[i];
            if(su.equals("R")) {
                if(score < 4) {
                    R += 4 - score;
                } else if (score > 4) {
                    T += score - 4;
                }
            } else if (su.equals("T")) {
                if(score < 4) {
                    T += 4 - score;
                } else if (score > 4) {
                    R += score - 4;
                }
            } else if (su.equals("C")) {
                if(score < 4) {
                    C += 4 - score;
                } else if (score > 4) {
                    F += score - 4;
                }
            } else if (su.equals("F")) {
                if(score < 4) {
                    F += 4 - score;
                } else if (score > 4) {
                    C += score - 4;
                }
            } else if (su.equals("J")) {
                if(score < 4) {
                    J += 4 - score;
                } else if (score > 4) {
                    M += score - 4;
                }
            } else if (su.equals("M")) {
                if(score < 4) {
                    M += 4 - score;
                } else if (score > 4) {
                    J += score - 4;
                }
            } else if (su.equals("A")) {
                if(score < 4) {
                    A += 4 - score;
                } else if (score > 4) {
                    N += score - 4;
                }
            } else { // N인 경우
                if(score < 4) {
                    N += 4 - score;
                } else if (score > 4) {
                    A += score - 4;
                }
            }
        }
        
        if(R > T) {
            answer += "R";
        } else if(T > R) {
            answer += "T";
        } else { // 같은 경우
            answer += "R";
        }
        
        if(C > F) {
            answer += "C";
        } else if(F > C) {
            answer += "F";
        } else { // 같은 경우
            answer += "C";
        }
        
        if(J > M) {
            answer += "J";
        } else if(M > J) {
            answer += "M";
        } else { // 같은 경우
            answer += "J";
        }

        if(A > N) {
            answer += "A";
        } else if(N > A) {
            answer += "N";
        } else { // 같은 경우
            answer += "A";
        }
        
        return answer;
    }
}