import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int answer = Integer.MIN_VALUE;
        int n = Integer.parseInt(st.nextToken()); // 전체 날짜의 수
        int k = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜의 수

        String[] strArr = bf.readLine().split(" ");

        int sum = 0;

        // 초기 sum 값 세팅
        for(int i = 0; i <= k - 1; i++) {
            sum += Integer.parseInt(strArr[i]);
        }
        answer = sum;
        int start = 0;
        int end = k - 1;

        while(end < strArr.length - 1) { // end가 배열의 마지막으로 올 때 까지
            sum -= Integer.parseInt(strArr[start]);
            start += 1;
            end += 1;
            sum+= Integer.parseInt(strArr[end]);

            answer = Math.max(answer, sum);


        }

        System.out.println(answer);

    }
}