class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strArr = new String[array.length];
        
        for(int i = 0; i < array.length; i++) {
           String[] tStrArr = Integer.toString(array[i]).split("");
            for(String str : tStrArr) {
                if(str.equals("7")) {
                    answer ++;
                }
            }
        }
        
        return answer;
    }
}