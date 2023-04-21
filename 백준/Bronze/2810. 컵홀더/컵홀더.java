import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();
        String[] strArr = str.split("");
        int result = 1;

        for(int i = 0; i < strArr.length; i++ ) {
            if("S".equals(strArr[i])) {
                result++;
            }

            if("L".equals(strArr[i])) {
                result++;
                i++;
            }
        }

        if(count < result) {
            System.out.println(count);
        } else {
            System.out.println(result);
        }
    }
}
