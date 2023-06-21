class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a != b) {
            a = divTwo(a);
            b = divTwo(b);
            answer++;
        }

        return answer;
    }
    
    public int divTwo(int num) {
        if(num % 2 == 0) { // 짝수 일 때
            return num / 2;
        } else { // 홀수 일 때
            return (num / 2) + 1;
        }
    }
}