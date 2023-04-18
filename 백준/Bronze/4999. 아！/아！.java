import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        ArrayList x = new ArrayList();
        ArrayList y = new ArrayList();

        while (count < 2) {

            if(count == 0) {
                x.add(sc.next());
            } else {
                y.add(sc.next());
            }

            count++;
        }

        if(x.get(0).toString().length() >= y.get(0).toString().length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
