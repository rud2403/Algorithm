import java.util.*;

class Solution {
    public static int solution(int[] order) {
        int answer = 0;
        int idx = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= order.length; i++) {
            boolean flag = false;
            
            if (order[idx] == i) { // 실어야 하는 택배와 같은 경우
                answer++;
                idx++;
                flag = true;
            } 
            
            while(!stack.empty() && stack.peek() == order[idx]) {
                answer++;
                idx++;
                stack.pop(); 
                flag = true;
            }
            
            if(!flag) {
                stack.push(i);
            }
        }

        while(!stack.empty() && stack.peek() == order[idx]) {
            answer++;
            idx++;
            stack.pop();           
        }

        return answer;
    }
}