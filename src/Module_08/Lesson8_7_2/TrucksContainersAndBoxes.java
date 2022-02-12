package Module_08.Lesson8_7_2;

import java.util.Scanner;

public class TrucksContainersAndBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ящиков : ");
        int boxes = scanner.nextInt();
        int countCargoCar = 0;
        int countСontainer = 0;
        int countBox = 0;

        StringBuilder text = new StringBuilder();
        for (int i = 0; i <= boxes - 1; i++) {

            if (i % 324 == 0) {
                text.append("Грузовик: " + ++countCargoCar + System.lineSeparator());
            }
            if (i % 27 == 0) {
                text.append("\tКонтейнер: " + ++countСontainer + System.lineSeparator());
            }
            text.append("\t\tЯщик: " + ++countBox + System.lineSeparator());

        }
        System.out.println(text.append("Необходимо:" +  System.lineSeparator() + "грузовиков - " + countCargoCar + " шт." + System.lineSeparator() + "контейнеров - " + countСontainer + " шт."));
    }
}










