import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(23);
        list.add(24);
        list.add(52);
        list.add(1);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
