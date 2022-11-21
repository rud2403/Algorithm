class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        idx = (k - 1) * 2;
        
        System.out.println("idx : " + idx);
        if(idx > numbers.length) {
            idx %= numbers.length;
        }
        return numbers[idx];
    }
}