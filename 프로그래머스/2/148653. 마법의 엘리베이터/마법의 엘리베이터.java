class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        // 가장 뒷 자리 수 부터 숫자 자르기
        // 자른 숫자가 5보다 작으면 -하기
        // 자른 숫자가 5보다 크거나 같으면 숫자 올려서 -하기
        // 자른 숫자의 앞자리 수 +1 해주기
        
        // ex) 2554
        // 255 / 4 = 4는 5보다 작다. - 4번
        // 25 / 5 = 5는 5보다 크거나 같다. + 5번
        // * 25의 5에 +1 해주기
        // 2 / 6 = 6은 5보다 크거나 같다. + 4번
        // 3 = 3은 5보다 작다. - 3번
        
        while (storey > 0) {
            int num = storey % 10; // 마지막 숫자 하나 뗀 거
            
            storey /= 10; // 마지막 숫자 뗀 나머지 수
            
            System.out.println("num(마지막 수) : " +  num);
            
            if(num > 5 || storey % 10 == 9) {
                answer += 10 - num;
                storey++;
                
                System.out.println("answer : " +  answer);
                System.out.println("마지막에서 떼고 남은 수111 : " + storey);
                
            } else {
                answer += num;
                System.out.println("answer : " +  answer);
                System.out.println("마지막에서 떼고 남은 수222 : " + storey);
            }
            System.out.println("---------------------");
            
        }
        
        
        return answer;
    }
}


