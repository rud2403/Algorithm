import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder preNum = new StringBuilder();
        Stack<String> stack = new Stack<>();
        boolean b = false;

        String[] strArr = my_string.split("");

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].matches("^[0-9]*$")) {

                if(b == true) {
                    stack.pop();
                    preNum.append(strArr[i]);
                    stack.push(preNum.toString());
                } else {
                    preNum.append(strArr[i]);
                    stack.push(preNum.toString());
                }

                b = true;
            } else {
                preNum.setLength(0);
                b = false;
            }
        }

        while(!stack.isEmpty()) {
            answer += Integer.parseInt(stack.pop());
        }
        
        return answer;
    }
}