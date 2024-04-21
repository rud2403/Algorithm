class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int bonusCk = 0;
        
        while(coupon >= 10) {
            bonusCk = coupon / 10;
            coupon %= 10;
            coupon += bonusCk;
            answer += bonusCk;
            bonusCk = 0;
        }
        
        return answer;
    }
}