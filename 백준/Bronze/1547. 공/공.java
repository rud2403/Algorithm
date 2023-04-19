import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cups = {"1", "0", "0"};
        int count = sc.nextInt();
        String temp = null;
        for(int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            temp = cups[x - 1];
            cups[x - 1] = cups[y - 1];
            cups[y - 1] = temp;
        }


        for(int i = 0; i < cups.length; i++) {
            if("1".equals(cups[i])) {
                System.out.println(i + 1);
            }
        }
    }
}
