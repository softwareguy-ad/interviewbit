package reverse;

public class Reverse {

    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        reverseStr("akshay");
        System.out.println(stringBuilder.toString());
    }

    private static void reverseStr(String str) {
        if(str.length() == 0){
            return;
        }
        stringBuilder.append(str.charAt(str.length()-1));
        reverseStr(str.substring(0, str.length()-1));
    }
}
