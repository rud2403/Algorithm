import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int five = n / 5;
        int three = 0;

        if (n % 5 != 0) {
            while (five >= 0) {
                int remainder = n - five * 5;
                if (remainder % 3 == 0) {
                    three = remainder / 3;
                    break;
                }
                five--;
            }
        } else {
            three = 0;
        }

        if (five < 0) {
            System.out.println("-1");
        } else {
            System.out.println(five + three);
        }
    }
}