import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수의 개수
        int arr[] = new int[8001]; // 입력값의 범위 -4000 ~ 4000
        int sum = 0; // 총 합계
        int max = Integer.MIN_VALUE; // 최댓값
        int min = Integer.MAX_VALUE; // 최솟값
        int median = 10000; //중앙 값
        int mode = 10000; // 최빈값

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if (max < value) {
                max = value;
            }

            if (min > value) {
                min = value;
            }
        }

        int count = 0; // 중앙값 빈도 누적 수
        int mode_max = 0; // 최빈값의 최댓값

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                // 중앙값 찾기
                if (count < (n + 1) / 2) {
                    count += arr[i]; // i값의 빈도수를 count에 누적
                    median = i - 4000;
                }

                // 최빈값 찾기
                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }

                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 즉, 두번째 최빈값
                else if (mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / n));  // 산술평균
        System.out.println(median);  // 중앙값
        System.out.println(mode);  // 최빈값
        System.out.println(max - min);  // 범위

    }
}