package Module_10;

import java.util.*;

public class TestCoolNumbers {
    private static Scanner scanner = new Scanner(System.in);
    private static CoolNumbers coolNumbers = new CoolNumbers();
    private static final String MESSAGE_USER_INPUT_AUTO_NUMBER = "Введите ГосНомер автомобиля: ";
    private static final String ANSWER_SYSTEM_TIME = "Поиск занял: ";

    public static void main(String[] args) {
        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            String inputAutoNumberUser = scanner.nextLine();
            List<String> listGenerated = CoolNumbers.generateCoolNumbers();

            long startTime1 = System.nanoTime();
            CoolNumbers.bruteForceSearchInList(listGenerated, inputAutoNumberUser);
            System.out.println((System.nanoTime() - startTime1) + " " + "нс");


            Collections.sort(listGenerated);
            long startTime2 = System.nanoTime();
            CoolNumbers.binarySearchInList(listGenerated, inputAutoNumberUser);
            System.out.println((System.nanoTime() - startTime2) + " " + "нс");


            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            long startTime3 = System.nanoTime();
            CoolNumbers.searchInHashSet(listHashSet, inputAutoNumberUser);
            System.out.println((System.nanoTime() - startTime3) + " " + "нс");


            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            long startTime4 = System.nanoTime();
            CoolNumbers.searchInTreeSet(listTreeSet,inputAutoNumberUser);
            System.out.println((System.nanoTime() - startTime4) + " " + "нс");

            System.out.println();
        }
    }
}

