import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] strArr = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(strArr[i]);

            for(int j = 0; j < n; j++) {
                if(cnt == 0 && arr[j] == 0) {
                        arr[j] = i + 1;
                    break;
                }

                if(arr[j] == 0) {
                    cnt--;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
