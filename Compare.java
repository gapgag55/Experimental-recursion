/**
 * Created by kopkap on 4/6/2017 AD.
 */
public class Compare {
    public static void main(String[] args) {
        int text = compare("ABC", "ABC");
        System.out.println(text);
    }

    public static int compare(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return 0;
        }
        return 1;
    }
}
