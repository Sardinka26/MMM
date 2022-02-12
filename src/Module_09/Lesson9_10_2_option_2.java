package Module_09;

import java.util.Scanner;

public class Lesson9_10_2_option_2 {     // код без регулярки

    public static String[] mySplit(String s) {
        String surname = s.substring(0, s.indexOf(" "));
        String name = s.substring(s.indexOf(" ") + 1, s.lastIndexOf(" "));
        String patronymic = s.substring(s.lastIndexOf(" ") + 1);
        return new String[]{surname, name, patronymic};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String shablon = "Фамилия: %s\r\nИмя: %s\r\nОтчество: %s";
        int countBadWords = 0;
        int countWordsInLine = 0;

        if (input.length() != 0) {
            countWordsInLine++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    countWordsInLine++;
                }
            }

            if (countWordsInLine == 3) {
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
                    String[] words = mySplit(input);
                    System.out.printf(shablon, words);
                }
            } else {
                System.out.println("Введенная строка не является ФИО ");
            }

        }

    }
}







