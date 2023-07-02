class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        /*  a = 콜라를 받기 위해 마트에 주어야하는 병 수
            b = 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
            n = 가지고 있는 빈 병의 개수
        */
        
        while(n >= a) { // 빈 병 수(c) + 받은 병 수(b)가 마트에 주어야하는 병 수(a)보다 크거나 같은 경우 반복
            
            int temp = (n / a) * b; // 받을 병 수
            
            n = n % a;
            
            answer += temp;
            
            n = n + temp;
            
        }
        return answer;
    }
}