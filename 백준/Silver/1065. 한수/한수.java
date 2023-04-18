import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 만약 입력값이 111보다 작으면 99리턴
		
		int num = sc.nextInt();
		int result = 99;
		String str;
		String strArr[];
		
		if(num < 100){
			
			result = num; 
			
		} else {
			for(int i=100; i <= num; i++ ) {
				
				str = Integer.toString(i);
				
				strArr = str.split("");
				
				int chai = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[1]);
				
				for(int j = 1; j < strArr.length - 1; j++) {
					
					if(chai == Integer.parseInt(strArr[j]) - Integer.parseInt(strArr[j+1])) {
						result += 1;
					}
				}
			}
		}
		
		System.out.println(result);
		
	}
}