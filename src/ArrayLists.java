import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    /**
    * The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(23);
        list.add(24);
        list.add(52);
        list.add(1);

        System.out.println(list);
        System.out.println(list.get(2));

        list.set(2, 34);
        list.remove(1);

        Collections.sort(list);
        System.out.println(list);

        list.clear();

        System.out.println(list);
    }
}
