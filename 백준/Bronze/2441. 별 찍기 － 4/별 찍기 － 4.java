import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i ++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = i; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
