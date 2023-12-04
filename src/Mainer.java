import java.util.HashMap;
import java.util.Map;

public class Mainer {
    public static void main(String[] args) {

        String str = "aabbcccddd";
        HashMap<Character, Integer> distinctCount = new HashMap<>();
        for(int i=0; i<str.length();i++){
            if(distinctCount.containsKey(str.charAt(i))){
                int count = distinctCount.get(str.charAt(i));
                distinctCount.put(str.charAt(i), count+1);
            }else {
                distinctCount.put(str.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : distinctCount.entrySet()){
            System.out.println("Key="+entry.getKey() + "Value="+entry.getValue());
        }
    }
}
