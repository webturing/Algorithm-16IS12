package lec16search2;

import java.util.Arrays;

public class E {
    public static void main(String[] args) {
        for (int a = 123; 3 * a <= 987; a++) {
            int b = 2 * a;
            int c = 3 * a;
            char[] cs = ("" + a + b + c).toCharArray();
            Arrays.sort(cs);
            if (new String(cs).equals("123456789")) {
                System.out.println(String.format("%d%d%d", a, b, c));
            }
        }
    }
}
