import java.util.*;

class Solution {
    public int solution(int num1, int num2) {
        double temp = ((double)num1 / (double)num2);
        System.out.println(temp);
        int answer = (int)Math.floor(temp * 1000);
        return answer;
    }
}