package reverse;

public class Reverse {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        reverseStr("akshay");
        System.out.println(sb.toString());
    }

    private static void reverseStr(String str) {
        if(str.isEmpty()){
            return;
        }
        sb.append(str.charAt(str.length()-1));
        reverseStr(str.substring(0, str.length()-1));
    }
}
