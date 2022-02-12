package Module_09;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Lesson9_9_6_option_2 {

    public static String checkNumberPhone(String input) {

        String regex = "(8|\\+?7)?9\\d{9}";
        String stringAfterСleaning = input.replaceAll("[^0-9]", "");

        if (stringAfterСleaning.length() > 11 || stringAfterСleaning.length() < 10) {
            return "Неверный формат номера ";
        }

        if (stringAfterСleaning.length() == 10 && stringAfterСleaning.matches(regex)) {
            return String.format("7%s", stringAfterСleaning);
        }

        if (stringAfterСleaning.length() == 11 && stringAfterСleaning.matches(regex)) {
            return String.format("7%s", stringAfterСleaning.substring(1));
        } else {
            return "Неверный формат номера ";

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(checkNumberPhone(input));

    }
}



