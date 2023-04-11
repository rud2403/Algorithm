import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		x.close();
		
		System.out.println(a * b);
	}

}