package Module_09;

import java.util.Scanner;

public class Lesson9_9_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([а-яА-Я]+)\\-?([а-яА-Я]+)\\s([а-яА-Я]+)\\s([а-яА-Я]+)";
        String sample = "Фамилия: %s\r\nИмя: %s\r\nОтчество: %s";

        if (input.matches(regex)) {
            String[] words = input.split(" ");
            System.out.printf(sample, words);
        } else {
            System.out.println("Введенная строка не является ФИО ");
        }

    }
}

