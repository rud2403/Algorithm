class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        int[] rankArr = new int[emergency.length];
        int idx = 0;

        for(int i = 0; i < emergency.length; i++) {
            int rank = 1;
            idx = i;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    rank ++;
                }
            }
            rankArr[idx] = rank;
        }
        return rankArr;
    }
}