import java.util.Arrays;

class Solution {
    public int solution(String word) {
        
        String[] alpArray = {"A", "E", "I", "O", "U"};
        int[] numArray = {781, 156, 31, 6, 1};
        String[] wordArray = word.split("");
        
        int answer = 0;
        
        for(int i = 0; i < wordArray.length; i++) {
            answer += (Arrays.asList(alpArray).indexOf(wordArray[i]) * numArray[i]) + 1;
        }
        
        
        return answer;
    }
}