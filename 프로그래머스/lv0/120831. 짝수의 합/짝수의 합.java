class Solution {
    public int solution(int n) {
        int zero = 0;
        int sum = 0;
        while (n != zero) {
            if(n%2 == 0) sum += n;
            n--;
        }
        int answer = sum;
        return answer;
    }
}