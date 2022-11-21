import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        BigInteger A_binary = new BigInteger(bin1, 2);
		BigInteger B_binary = new BigInteger(bin2, 2);
		
		BigInteger sum = A_binary.add(B_binary);
		
		String sum_binary = sum.toString(2);
        
        return sum_binary;
    }
}