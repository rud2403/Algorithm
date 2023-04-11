import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long result = sc.nextLong();
        Long sum = 0L;
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            sum += num1 * num2;
        }

        if (sum.equals(result)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
