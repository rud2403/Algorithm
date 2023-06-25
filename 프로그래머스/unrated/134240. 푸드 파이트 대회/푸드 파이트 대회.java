class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i ++) {
            if(food[i] % 2 != 0) { // 홀수인 경우
                food[i] -= 1;
            }
            
            if(food[i] != 0) { // 0이 아닌 경우
                food[i] /= 2;
            }
            
            for(int j = 0; j < food[i]; j++) {
                sb.append(i);
            }
        }
        
        sb.append("0");
        
        String[] strArr = sb.toString().split("");
        
        for(int i = sb.length() - 2; i >= 0; i--) {
            sb.append(strArr[i]);
        }
        
        return sb.toString();
    }
}