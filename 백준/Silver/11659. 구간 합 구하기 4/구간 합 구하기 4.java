import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str1 = bf.readLine();
        String[] strArr1 = str1.split(" ");

        int N = Integer.parseInt(strArr1[0]); // 수의 개수
        int M = Integer.parseInt(strArr1[1]); // 합을 구해야 하는 횟수

        String str2 = bf.readLine();
        String[] strArr2 = str2.split(" ");

        int[] intArr = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            intArr[i] = intArr[i - 1] + Integer.parseInt(strArr2[i - 1]);
        }

        for(int i = 0; i < M; i++) {
            String str3 = bf.readLine();
            String[] strArr3 = str3.split(" ");

            int start = Integer.parseInt(strArr3[0]);
            int end = Integer.parseInt(strArr3[1]);

            System.out.println(intArr[end] - intArr[start - 1]);
        }
    }
}