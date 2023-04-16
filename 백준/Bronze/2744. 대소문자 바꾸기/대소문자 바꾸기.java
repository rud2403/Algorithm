import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
        }

        System.out.println(new String(chars));
    }
}