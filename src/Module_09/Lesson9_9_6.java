package Module_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson9_9_6 {

    public static String checkNumberPhone(String input) {

        String regex = "(8|\\+?7)\\d{10}";
        String stringAfterСleaning = input.replaceAll("[^0-9]", "");

        if (stringAfterСleaning.length() > 11 || stringAfterСleaning.length() < 10) {
            String result = "Неверный формат номера ";

        } else {
            if (stringAfterСleaning.matches(regex)) {



            }

        } return "";
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(checkNumberPhone(input));

    }
}
