class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int[] list1 = new int[num1.length()];
        int[] list2 = new int[num2.length()];
        int[] answer = new int[num1.length() + num2.length()];

        // num1, num2를 역순으로 배열에 저장
        for(int i = 0; i < num1.length(); i++) {
            list1[num1.length() - 1 - i] = num1.charAt(i) - '0';
        }

        for(int i = 0; i < num2.length(); i++) {
            list2[num2.length() - 1 - i] = num2.charAt(i) - '0';
        }
        
        int mul;
        int sum;
        for(int i = 0; i < list1.length; i++) {
            for(int j = 0; j < list2.length; j++) {
                mul = list1[i] * list2[j];
                sum = answer[i + j] + mul;

                answer[i + j] = sum % 10;
                answer[i + j + 1] += sum / 10;
            }
        }

        boolean isZero = true;
        for(int i = answer.length - 1; i >= 0; i--) {
            if(answer[i] != 0) isZero = false;

            if(!isZero) {
                sb.append(answer[i]);
            }
        }

        if(sb.length() == 0) sb.append("0");

        return sb.toString();
    }
}