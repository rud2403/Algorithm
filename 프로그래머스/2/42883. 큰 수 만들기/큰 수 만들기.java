import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            // 스택처럼 뒤에서부터 비교해서 더 작은 값이면 제거
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(c);
        }

        // 아직 제거할 k가 남았다면, 뒤에서 자르기
        return sb.substring(0, sb.length() - k);
    }
}