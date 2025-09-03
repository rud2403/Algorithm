import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 전체 날짜의 수
        int k = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜의 수

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i = 0; i <= k - 1; i++) sum += a[i];
        int answer = sum;
        int start = 0;
        int end = k - 1;

        while(end < a.length - 1) { // end가 배열의 마지막으로 올 때 까지
            sum -= a[start];
            start += 1;
            end += 1;
            sum+= a[end];

            answer = Math.max(answer, sum);
        }

        System.out.println(answer);

    }
}