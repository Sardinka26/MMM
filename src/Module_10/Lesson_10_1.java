package Module_10;

import java.util.Arrays;

public class Lesson_10_1 {
    public static String[] reverse(String[] strings) {

        for (int i = 0, b = strings.length - 1; i < strings.length / 2; b--, i++) {

            String str = strings[i];
            strings[i] = strings[b];
            strings[b] = str;
        }
        System.out.println(Arrays.toString(strings));
        return strings;
    }
}

