package examples;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Victor";
        String reverse = "";

        for ( String s : str.split("")) {
            reverse = s + reverse;
        }
//        for (int i = 0; i < str.length(); i++) {
//            reverse = str.charAt(i) + reverse;
//        }
        System.out.println(reverse);
    }

    static void reverseOne() {
        String str = "Victor";
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            reverse.insert(0, str.charAt(i));
        }
        System.out.println(reverse);
    }
}
