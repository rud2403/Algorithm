class Solution {
    public int solution(int[] array, int n) {
        int sum = 0;
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                sum += 1;
            }
        }
        
        answer = sum;
        return answer;
    }
}