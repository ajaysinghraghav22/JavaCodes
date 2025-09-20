import java.util.HashMap;
import java.util.*;

public class DistinictChar {
    public static void main(String[] args) {
        String str = "ajayraghavshab";
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            System.out.println(ch);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
System.out.println(map);
    }
}
