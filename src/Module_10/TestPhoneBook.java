package Module_10;

import java.util.Scanner;

public class TestPhoneBook {
    private static Scanner scanner = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();
    private static final String MESSAGE_USER_CORRECT_DATA = "Контакт сохранен!";
    public static final String WRONG_FORMAT_ANSWER = "Неверный формат ввода!";
    private static final String MESSAGE_USER_ERROR_NUMBER_PHONE = "Такого номера нет в телефонной книге";
    private static final String MESSAGE_USER_INPUT_NAME_PHONE = "Введите имя абонента для номера";
    private static final String MESSAGE_USER_ERROR_NAME_PHONE = "Такого имени в телефонной книге нет";
    private static final String MESSAGE_USER_INPUT_NUMBER_PHONE = "Введите номер телефона для абонента";
    private static final String LIST = "LIST";
    private static final String NUMBER = "79\\d{9}";
    private static final String NAME = "[А-Я][а-я]+";

    public static void main(String[] args) {
        phoneBook.addContact("79348882266", "Катя");
        phoneBook.addContact("79348880000", "Петр");
        phoneBook.addContact("79348880001", "Катя");

        while (true) {
            System.out.print("Введите номер, имя или команду:" + System.lineSeparator());
            String input = scanner.nextLine();

            if(input.matches(LIST)){
                phoneBook.getAllContacts();
                continue;
            }

            if (!input.matches(NUMBER) && !input.matches(NAME)) {
                System.out.println(WRONG_FORMAT_ANSWER);
                continue;
            }
            if (input.matches(NAME) && phoneBook.isNameContains(input)) {
                phoneBook.getContactByName(input);
                continue;
            }
            if (input.matches(NAME) && phoneBook.isNameNotContains(input)) {
                System.out.println(MESSAGE_USER_ERROR_NAME_PHONE);
                System.out.println(MESSAGE_USER_INPUT_NUMBER_PHONE + "\"" + input + "\"" + ":");
                String inputNumberPhone = scanner.nextLine();
                if (inputNumberPhone.matches(NUMBER)) {
                    phoneBook.addContact(inputNumberPhone, input);
                    System.out.println(MESSAGE_USER_CORRECT_DATA);
                    continue;

                } else {
                    System.out.println(WRONG_FORMAT_ANSWER);
                }
                continue;
            }
            if (input.matches(NUMBER) && phoneBook.isNumberContains(input)) {
                phoneBook.getContactByPhone(input);
                continue;
            }
            if (input.matches(NUMBER) && phoneBook.isNumberNotContains(input)) {
                System.out.println(MESSAGE_USER_ERROR_NAME_PHONE);
                System.out.println(MESSAGE_USER_INPUT_NAME_PHONE + "\"" + input + "\"" + ":");
                String inputName = scanner.nextLine(); // когда вводят Имя
                if (inputName.matches(NAME)) {
                    phoneBook.addContact(input, inputName);
                    System.out.println(MESSAGE_USER_CORRECT_DATA);
                    continue;
                } else {
                    System.out.println(WRONG_FORMAT_ANSWER);

                }
                continue;
            }
        }
    }
}
