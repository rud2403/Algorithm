class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        int length = numbers.length;
        double answer = 0;
        
        for(int i=0;i < length; i++){
            sum += numbers[i];
        }
        
        answer = sum / length;
        return answer;
    }
}