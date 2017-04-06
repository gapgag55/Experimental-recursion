import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        String text = reverse("KOPKAP");
        System.out.println(text);
    }

    public static String reverse(String s) {
        String before = s.substring(0, 1);
        int size = s.length();

        if(size == 1) {
            return before;
        }
        return reverse(s.substring(1, size)) + before;
    }
}

