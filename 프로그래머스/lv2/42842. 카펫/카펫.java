class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        int temp = 1995001;
        
        for(int i = 1; i <= sum / 2; i++) {
            int num1 = sum / i;
            int num2 = sum / num1;
            System.out.println(num1 + ", " + num2);
            
            if(num1 - num2 < temp && num1 >= num2 && ((i-2) * (sum / i - 2)) == yellow) {
                temp = num1 - num2;
                answer[0] = Math.max(num1, num2);
                answer[1] = Math.min(num1, num2);
            } else {
                break;
            }
        }
        
        
        return answer;
    }
}