class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] strArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
            System.out.println(str);
            if(str.equals(".-")) {
                sb.append("a");
            } else if (str.equals("-...")) {
                sb.append("b");
            } else if (str.equals("-.-.")) {
                sb.append("c");
            } else if (str.equals("-..")) {
                sb.append("d");
            } else if (str.equals(".")) {
                sb.append("e");
            } else if (str.equals("..-.")) {
                sb.append("f");
            } else if (str.equals("--.")) {
                sb.append("g");
            } else if (str.equals("....")) {
                sb.append("h");
            } else if (str.equals("..")) {
                sb.append("i");
            } else if (str.equals(".---")) {
                sb.append("j");
            } else if (str.equals("-.-")) {
                sb.append("k");
            } else if (str.equals(".-..")) {
                sb.append("l");
            } else if (str.equals("--")) {
                sb.append("m");
            } else if (str.equals("-.")) {
                sb.append("n");
            } else if (str.equals("---")) {
                sb.append("o");
            } else if (str.equals(".--.")) {
                sb.append("p");
            } else if (str.equals("--.-")) {
                sb.append("q");
            } else if (str.equals(".-.")) {
                sb.append("r");
            } else if (str.equals("...")) {
                sb.append("s");
            } else if (str.equals("-")) {
                sb.append("t");
            } else if (str.equals("..-")) {
                sb.append("u");
            } else if (str.equals("...-")) {
                sb.append("v");
            } else if (str.equals(".--")) {
                sb.append("w");
            } else if (str.equals("-..-")) {
                sb.append("x");
            } else if (str.equals("-.--")) {
                sb.append("y");
            } else {
                sb.append("z");
            } 
        }
        return sb.toString();
    }
}