import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(34);
        set.add(54);
        set.add(2);
        set.add(54);

        set.remove(34);

        System.out.println(set);
        System.out.println(set.contains(12));
    }
}
