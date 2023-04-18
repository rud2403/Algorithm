import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList arrayList = new ArrayList<>();
        for(int i = 0; i < 6; i++) {

            if(i == 0 || i == 1) {
                arrayList.add(1 - sc.nextInt());
            } else if(i == 5) {
                arrayList.add(8 - sc.nextInt());
            } else {
                arrayList.add(2 - sc.nextInt());
            }
        }

        for (Object o : arrayList) {
            System.out.print(o + " ");
        }
    }
}
