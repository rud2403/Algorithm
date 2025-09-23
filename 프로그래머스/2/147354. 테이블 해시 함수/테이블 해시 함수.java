import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        // 1. 정렬
        Arrays.sort(data, (a, b) -> a[col - 1] == b[col - 1] ? b[0] - a[0]: a[col - 1] - b[col - 1]);
        
        // 2. 각 컬럼의 값을 mod
        for(int i = row_begin - 1; i <= row_end - 1; i++) {
            int sum = 0;
            for(int j = 0; j < data[0].length; j++) {
                sum += data[i][j] % (i + 1);
            }
            answer ^= sum;
        }
        
        // 3. 구해진 값들을 XOR (^기호로 연산하면 됨)
        return answer;
    }
}