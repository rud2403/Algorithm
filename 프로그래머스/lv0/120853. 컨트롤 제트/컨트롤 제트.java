import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArr = s.split(" ");
        Stack<Integer> stack = new Stack();
        
        for (String i : sArr) {
            if (i.equals("Z")) {
                if (stack.size()!=0){
                    stack.pop();
                }
            } else {
	            int num = Integer.valueOf(i);
	            stack.push(num);
            }
        }
        for (int i : stack) {
        	answer += i;
        }
        
        return answer;
    }
}