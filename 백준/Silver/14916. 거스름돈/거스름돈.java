import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int num = Integer.parseInt(br.readLine());

        while(num > 0) {
            if(num % 5 == 0){ // 5로 나누어 떨어지는 경우
                result += num / 5;
                num %= 5;
            } else {
                result++;
                num -= 2;
            }
        }

        if(num == 0) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}