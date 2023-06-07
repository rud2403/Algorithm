import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp0 = new long[41];
        long[] dp1 = new long[41];

        dp0[0] = 1;
        dp0[1] = 0;

        dp1[0] = 0;
        dp1[1] = 1;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            for(int j = 2; j <= num; j++) {
                dp0[j] = dp0[j-1] + dp0[j-2];
                dp1[j] = dp1[j-1] + dp1[j-2];
            }

            System.out.println(dp0[num] + " " + dp1[num]);
        }
    }
}