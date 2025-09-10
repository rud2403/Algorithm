import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);
        int d = Integer.parseInt(strArr[3]);
        int e = Integer.parseInt(strArr[4]);
        int f = Integer.parseInt(strArr[5]);

        int det = a * e - b * d; // 분모
        int detX = c * e - b * f; // x 분자
        int detY = a * f - c * d; // y 분자

        int x = detX / det;
        int y = detY / det;

        System.out.println(x + " " + y);

    }
}