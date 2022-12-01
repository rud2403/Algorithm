class Solution {
    public String[] solution(String my_str, int n) {
        int arrLng = my_str.length() % n == 0 ? my_str.length() / n : (my_str.length() / n) + 1;
        String[] answer = new String[arrLng];
        
        for(int i = 0; i < arrLng; i++) {
            if(i == arrLng - 1) {
                answer[i] = my_str.substring(i * n, my_str.length());
            } else {
                answer[i] = my_str.substring(i * n, ((i + 1) * n));
            }
        }
        
        return answer;
    }
}