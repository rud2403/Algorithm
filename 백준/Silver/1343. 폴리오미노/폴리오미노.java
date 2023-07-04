import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        boolean dotFlag = false;

        int xCount = 0;
        int dotCount = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == 'X') { // 문자가 X인 경우

                if(dotCount != 0) {
                    for(int j = 0; j < dotCount; j++) {
                        sb.append(".");
                    }

                    dotCount = 0;
                }

                xCount++;
            } else { // 문자가 .인 경우
                if(xCount != 0){
                    if(xCount % 2 == 0) { // 이전까지 나온 X문자의 수가 짝수인 경우
                        while(xCount > 0) {
                            if(xCount > 2) { // xCount가 2초과인 경우
                                xCount -= 4;
                                sb.append("AAAA");
                            } else {
                                xCount -=2;
                                sb.append("BB");
                            }
                        }
                    } else { // 이전까지 나온 X문자의 수가 홀수인 경우
                        System.out.println(-1);
                        xCount = 0;
                        break;
                    }
                }

                dotCount++;
            }
        }

        // xCount나 dotCount가 0이 아닌경우
        if(xCount != 0) {
            if(xCount % 2 == 0) { // 이전까지 나온 X문자의 수가 짝수인 경우
                while(xCount > 0) {
                    if(xCount > 2) { // xCount가 2초과인 경우
                        xCount -= 4;
                        sb.append("AAAA");
                    } else {
                        xCount -=2;
                        sb.append("BB");
                    }
                }

                System.out.println(sb.toString());
            } else { // 이전까지 나온 X문자의 수가 홀수인 경우
                System.out.println(-1);
            }
        }

        if(dotCount != 0) {
            for(int j = 0; j < dotCount; j++) {
                sb.append(".");
            }
            System.out.println(sb.toString());
        }
    }
}