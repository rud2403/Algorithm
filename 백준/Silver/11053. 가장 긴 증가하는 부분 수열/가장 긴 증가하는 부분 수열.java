import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        String[] numStrings = bf.readLine().split(" ");
        int[] nums = new int[size];
        int[] dp = new int[size];
        for(int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }

        Arrays.fill(dp, 1);

        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}