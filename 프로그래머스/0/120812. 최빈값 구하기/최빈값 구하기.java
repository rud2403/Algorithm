class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int max = -1;
        int[] intArr = new int[1000];
        
        for(int i : array) {
            intArr[i]++;
        }
        
        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] > max) {
                System.out.println("intArr[i] : " + intArr[i]);
                System.out.println("max : " + max);
                System.out.println("-------------------------");
                max = intArr[i];
                answer = i;
            } else if (intArr[i] == max) {
                answer = -1;
            }
        }
        
        return answer;
    }
}