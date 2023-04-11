import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int dividedQuotient = num / 4;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < dividedQuotient; i ++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);
    }
}
