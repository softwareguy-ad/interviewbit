package reverse;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNums(123400);

    }

    private static void reverseNums(int i) {
        int rev = 0;
        while (i > 0) {
            int lD = i % 10;
            rev = rev * 10 + lD;
            i = i / 10;
        }
        System.out.println("rev No " + rev);
    }
}
