import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("black");
        colorList.add("brown");
        colorList.add("red");
        colorList.add("orange");
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("blue");
        colorList.add("violet");
        colorList.add("grey");
        colorList.add("white");

        ArrayList<String> valList = new ArrayList<>();
        valList.add("0");
        valList.add("1");
        valList.add("2");
        valList.add("3");
        valList.add("4");
        valList.add("5");
        valList.add("6");
        valList.add("7");
        valList.add("8");
        valList.add("9");

        ArrayList<String> mulList = new ArrayList<>();
        mulList.add("1");
        mulList.add("10");
        mulList.add("100");
        mulList.add("1000");
        mulList.add("10000");
        mulList.add("100000");
        mulList.add("1000000");
        mulList.add("10000000");
        mulList.add("100000000");
        mulList.add("1000000000");

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 2; i++) {

            int index = colorList.indexOf(sc.next());

            sb.append(valList.get(index));
        }

        int mulIndex = colorList.indexOf(sc.next());
        String mul = mulList.get(mulIndex);

        Long result = Long.parseLong(sb.toString()) * Long.parseLong(mul);

        System.out.println(result);
    }
}
