class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int size = 0;
        int result = 0;

        while(index < s.length()) {
            // 이미 있는 문자면
            if(sb.indexOf(s.charAt(index) + "") != -1) {
                sb.deleteCharAt(0);
                size--;
            } else { // 없는 문자면
                sb.append(s.charAt(index) + "");
                index++;
                size++;
            }

            result = Math.max(size, result);
        }

        return result;
    }
}