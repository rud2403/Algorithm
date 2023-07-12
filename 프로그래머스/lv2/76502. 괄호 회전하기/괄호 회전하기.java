import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < sb.length(); i++) {
            // 문자열 왼쪽으로 한번 이동
            StringBuilder temp = sb;
            String c = temp.substring(0, 1);
            temp = temp.delete(0, 1);
            
            temp = temp.append(c);
            
            stack.clear();
                
            // 올바른 괄호인지 검증
            for(int j = 0; j < temp.length(); j++) {
                
                if(temp.charAt(j) == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                
                if(temp.charAt(j) == ']') {
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                
                if(temp.charAt(j) == '}') {
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                
                if(temp.charAt(j) == '(' || temp.charAt(j) == '[' || temp.charAt(j) == '{') {
                    stack.push(temp.charAt(j));
                }
                
                if(j == temp.length() - 1 && stack.isEmpty()) {
                    answer++;
                }
                
            } // 괄호 검증 끝

            
        }
        
        return answer;
    }
}