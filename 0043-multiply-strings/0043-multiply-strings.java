class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int[] answer = new int[400];

        // num1, num2를 역순으로 배열에 저장
        for(int i = num1.length() - 1; i >= 0; i--) {
            list1.add((num1.charAt(i)) - '0');
        }

        for(int i = num2.length() - 1; i >= 0; i--) {
            list2.add((num2.charAt(i)) - '0');
        }
        int mul;
        int sum;
        for(int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                mul = list1.get(i) * list2.get(j);
                sum = answer[i + j] + mul;

                answer[i + j] = sum % 10;
                answer[i + j + 1] += sum / 10;
            }
        }

        boolean isZero = true;
        for(int i = answer.length - 1; i >= 0; i--) {
            if(answer[i] != 0) isZero = false;

            if(!isZero) {
                sb.append(Integer.toString(answer[i]));
            }
        }

        if(sb.toString().equals("")) sb.append("0");

        return sb.toString();
    }
}