package Module_10;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestEmailList {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static Scanner scanner = new Scanner(System.in);
    private static EmailList emailList = new EmailList();
    private static final String LIST = "LIST";
    private static final String ADD = "ADD.+";

    public static void main(String[] args) {

        emailList.add("sardinka2021@mail.ru");
        emailList.add("avtonew2021@mail.ru");

        while (true) {
            String input = scanner.nextLine();

            if (input.contains(LIST)) {
                emailList.getSortedEmails();
                continue;
            }
            if (input.matches(ADD)) {
                emailList.add(input);

            }
        }
    }
}


