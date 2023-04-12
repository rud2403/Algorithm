import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();		
		
		int time = M - 45;
		if(time < 0) {
			H = H -1;
			M = 60 + time;
			if(H < 0) {
				H = 23;
			}
		}else{
			M = time;
		}
		System.out.println(H + " " + M);
	}

}