class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            answer[i] = -1;
        }
        
        for(int i = s.length() - 1; i >= 0; i--) {
            int count = 0;
            
            System.out.println(s.charAt(i));
            
            if(i != 0) {
                for(int j = i - 1; j >= 0; j--) {
                    if(s.charAt(i) == s.charAt(j)) { // i번째 문자와 j번째 문자가 같은 경우
                        // System.out.println(s.charAt(j));
                        count += 1;
                        answer[i] = count;
                        break;
                    } else { // i번째 문자와 j번째 문자가 다른 경우
                        // System.out.println(s.charAt(j));
                        // System.out.println("--------------------------------------");
                        count += 1;
                    }
                } 
            }
        }
        
        return answer;
    }
}