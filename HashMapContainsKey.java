import java.util.HashMap;

public class HashMapContainsKey {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(19, "Shyam");
        System.out.println(hm.containsKey(19));
    }
}
