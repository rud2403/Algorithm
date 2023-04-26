import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mount = Integer.parseInt(br.readLine());
        int five = 0;
        int three = 0;
        boolean flag = false;

        while (mount > 0) {
            if (flag == false) {
                if (mount >= 5) {
                    mount -= 5;
                    five++;
                } else if (mount >= 3) {
                    mount -= 3;
                    three++;
                } else if(five != 0) {
                    flag = true;
                } else {
                    System.out.println(-1);
                    return;
                }

            } else {
                if(mount >= 3) {
                    three++;
                    mount -= 3;
                } else if (five != 0){
                    five --;
                    mount += 5;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(five + three);

    }
}
