
public class Equals {
    public static void main(String[] args) {
        boolean text = equals("ABC", "ABC");
        System.out.println(text);
    }

    public static boolean equals(String s1, String s2) {
        char first = s1.charAt(0);
        char second = s2.charAt(0);
        boolean check = false;

        // Eg. ABC and ABCD -> 3 != 4
        if(s1.length() != s2.length()) return false;

        // Eg. A == A otherwise, false
        if(first == second) {
            check = true;
        }
        // Eg. s1 == A or s2 == A
        if(s1.length() == 1) {
            return check;
        }

        // Eg. 138 and 138 = (true && true) && true
        return check && equals(s1.substring(1, s1.length()), s2.substring(1, s1.length()));
    }
}
