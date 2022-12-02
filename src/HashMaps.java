import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"victor");
        map.put(2,"hugo");
        map.put(3,"mattos");

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
