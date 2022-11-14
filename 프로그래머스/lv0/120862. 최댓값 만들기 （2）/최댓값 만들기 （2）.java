import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int x = numbers[0] * numbers[1];
        int y = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return x > y ? x : y;
    }
}