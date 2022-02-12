package Module_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson9_9_3 {

    public static int calculateSalarySum(String text) {
        int salary = 0;
        Pattern pattern = Pattern.compile("\\d{1,10}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            salary = salary + Integer.parseInt(matcher.group());
        }
        return salary;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));

    }
}

