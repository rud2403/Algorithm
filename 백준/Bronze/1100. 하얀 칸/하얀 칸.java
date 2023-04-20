import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] table = new String[8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            table[i] = sc.next();
        }

        for (int j = 0; j < table.length; j++) {
            String[] split = table[j].split("");

            for(int k = 0; k < split.length; k++) {
                if((j + k) % 2 == 0 && "F".equals(split[k])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
