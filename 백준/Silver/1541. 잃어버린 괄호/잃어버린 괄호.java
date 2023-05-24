import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int plusTemp = 0;
    static int minusTemp = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        boolean isPlus = true;

        for(int i = 0; i < str.length(); i++) {

            if(isPlus == true) { // 직전 기호가 + 였을 때
                if(str.charAt(i) == '+') { // + 기호일 때
                    plusTemp += Integer.parseInt(sb.toString());
                    sb.setLength(0); // sb 초기화

                    isPlus = true;
                } else if(str.charAt(i) == '-') { // - 기호일 때
                    plusTemp += Integer.parseInt(sb.toString());
                    sb.setLength(0); // sb 초기화

                    isPlus = false;
                } else { // 숫자일 때
                    sb.append(str.charAt(i));
                    if(i == str.length() - 1) { // 마지막 숫자의 끝
                        plusTemp += Integer.parseInt(sb.toString());
                    }
                }
            } else { // 직전 기호가 - 였을 때
                if(str.charAt(i) == '+') { // + 기호일 때
                    minusTemp -= Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } else if(str.charAt(i) == '-') { // - 기호일 때
                    minusTemp -= Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } else { // 숫자일 때
                    sb.append(str.charAt(i));
                    if(i == str.length() - 1) { // 마지막 숫자의 끝
                        minusTemp -= Integer.parseInt(sb.toString());
                    }
                }
            }
        }

        System.out.println(plusTemp + minusTemp);

        br.close();
    }
}