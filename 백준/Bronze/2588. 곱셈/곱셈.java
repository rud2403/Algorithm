import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = b - (b - (b%10));
		int y = (b%100);
		int k = (y%10);
		y = (y-k)/10;
		int l = (b-(b%100))/100;
		
		int sum1 = a*x;
		int sum2 = a*y;
		int sum3 = a*l;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum1 + (sum2*10) + (sum3*100));


	}

}
