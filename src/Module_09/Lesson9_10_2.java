package Module_09;

import java.util.Scanner;

public class Lesson9_10_2 {     // код  с регуляркой

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваше ФИО : ");
        String input = scanner.nextLine();
        String shablon = "Фамилия: %s\r\nИмя: %s\r\nОтчество: %s";
        String[] countWordsArray = input.split(" ", '-');
        int countBadWords = 0;

        if (countWordsArray.length == 3) {
            for (int n = 0; n < input.length(); n++) {
                char simvol = input.charAt(n);

                if (simvol == ' ' || simvol == '-') {
                    continue;
                }
                if (Character.isDigit(simvol) || Character.UnicodeBlock.of(simvol) != Character.UnicodeBlock.CYRILLIC) {
                    countBadWords++;
                }
            }
            if (countBadWords > 0) {
                System.out.println("Введенная строка не является ФИО ");

            } else {
                String[] words = input.split(" ", ' ');
                System.out.printf(shablon, words);
            }

        } else {
            System.out.println("Введенная строка не является ФИО ");
        }

    }

}





















