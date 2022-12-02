package examples;

public class CountWords {
    public static void main(String[] args) {
        String words = "One Two Three Four";
        int count = words.split("\\s").length;
        System.out.println(count);
    }
}
