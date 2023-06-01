import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("");
        int[] list = new int[10];

        for(int i = 0; i < strArr.length; i++) {
            int n = Integer.parseInt(strArr[i]);
            list[n] += 1;
        }

        int max = 0;
        int index = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] > max) {
                max = list[i];
                index = i;
            } else if ((list[i] == max) && index == 6) {
                max = list[i];
                index = i;
            }
        }

        if(index == 6 || index == 9){ // 최대값의 인덱스가 6 또는 9일 때
            if((list[6] + list[9]) % 2 == 0) { // 6과 9를 더한 수가 짝수 일때
                System.out.print((list[6] + list[9]) / 2);
            } else { // 6과 9를 더한 수가 홀수 일때
                System.out.print(((list[6] + list[9]) / 2) + 1);
            }
        } else { // 최대값의 인덱스가 6 또는 9가 아닐 때
            System.out.print(list[index]);
        }
    }
}