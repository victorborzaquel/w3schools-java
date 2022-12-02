import java.util.LinkedList;

public class LinkedLists {
    /**
     * The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
     * Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(23);
        list.add(4);
        list.add(34);
        list.add(12);

        list.addFirst(122);
        list.addLast(122);
        list.removeFirst();
        list.removeLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);
    }
}
