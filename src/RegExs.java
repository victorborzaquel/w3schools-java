import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExs {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[hugo]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Victor Hugo de Mattos Borzaquel");

        boolean matchFound = matcher.find();
        System.out.println(matchFound ? "Found" : "Not found");
    }
}
