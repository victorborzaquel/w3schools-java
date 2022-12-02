import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Lambdas {
    public static void main(String[] args) {
        StringFunction ask = s -> s + "?";

        String result = ask.run("Ajuda");

        System.out.println(result);
    }

    void example() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        Consumer<Integer> method2 = System.out::println;
        numbers.forEach( method );
    }
}
