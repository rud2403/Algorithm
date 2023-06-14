import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> intArr = new ArrayList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int m = Integer.parseInt(strArr[0]); // 시작하는 숫자
        int n = Integer.parseInt(strArr[1]); // 끝나는 숫자

        for(int i = m; i <= n; i++) {
            isPrime(i);
        }

        for (int integer : intArr) {
            System.out.println(integer);
        }
    }

    public static void isPrime(int number) {
        if (number <= 1) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return;
            }
        }

        intArr.add(number);
    }
}