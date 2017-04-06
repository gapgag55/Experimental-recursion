import java.util.*;

public class Toint {
    public static void main(String[] args) {
        int text = toInt("138");
        System.out.println(text);
    }

    public static int toInt(String number) {
        int length = number.length();
        int value = Integer.parseInt(number);

        // Eg. 138, return 8
        if(length == 1) return value;

        // Eg. 138, first equals 1
        int first = Integer.parseInt(number.substring(0, 1));

        // Eg. 138, (1 * 10^2) + (3 * 10^1) + (8 * 10^0)
        value = first * (int) Math.pow(10, length - 1);

        // Eg. 100 + 30 + 8
        return value + toInt(number.substring(1, length));
    }
}
