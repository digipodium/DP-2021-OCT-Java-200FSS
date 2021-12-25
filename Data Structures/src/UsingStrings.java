import java.util.Locale;
import java.util.Scanner;

public class UsingStrings {
    public static void main(String[] args) {

//        String is a collection of character
        String name = "Mubassir";

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you friend name : ");
//        String fr_name = sc.next();
//
//        System.out.println(fr_name);

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('i'));

        String mov = "Spiderman : No Way Home";

        System.out.println(mov.contains("Way"));
        System.out.println(mov.startsWith("Spider"));
        System.out.println(mov.endsWith("Home"));

        System.out.println(mov.toLowerCase());
        System.out.println(mov.toUpperCase());

        String uncleaned = "  765937        ";
        System.out.println(uncleaned.strip());
        System.out.println(uncleaned.trim());
        System.out.println(mov.replace(' ', '_'));
    }
}
