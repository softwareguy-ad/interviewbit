package reverse;

public class StringUtils {
    public static void main(String[] args) {
        String str = "hel  lo";
        String reversedStr = new String(reversedStringRecursive(str.toCharArray(), 0, str.length() - 1));
        String originalStr = reverseAStringIterative(reversedStr);
        System.out.println(originalStr);
        System.out.println(originalStr.equals(str));
    }

    private static String reverseAStringIterative(String reversedStr) {
        StringBuffer str = new StringBuffer(reversedStr);
        int l = 0, r = reversedStr.length() - 1;
        while (l < r) {
            char tmp = reversedStr.charAt(l);
            str.setCharAt(l, reversedStr.charAt(r));
            str.setCharAt(r, tmp);
            l++;
            r--;
        }
        return str.toString();
    }


    private static char[] reversedStringRecursive(char[] str, int l, int r) {
        if (l == r) {
            return str;
        }
        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;
        return reversedStringRecursive(str, l + 1, r - 1);
    }

}
