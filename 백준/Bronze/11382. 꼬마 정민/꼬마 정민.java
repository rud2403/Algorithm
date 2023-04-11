import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();
        String num3 = sc.next();

        String num = num1 + " " + num2 + " " + num3;

        String[] numArray = num.split(" ");
        long sum = 0;

        for (String s : numArray) {
            sum += Long.parseLong(s);
        }

        System.out.println(sum);
    }
}
