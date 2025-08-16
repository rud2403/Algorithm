import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if(dq.isEmpty()) {
                dq.offerLast(s.charAt(i));
            } else {
                if(dq.peekLast() == s.charAt(i)) {
                    dq.offerLast(s.charAt(i));
                    
                } else {
                    dq.pollLast();
                    
                    if(dq.isEmpty()) {
                        answer++;
                    }
                                        
                }
            }
        }
        
        if(!dq.isEmpty()) {
            answer++;
        }

        return answer;
    }
}