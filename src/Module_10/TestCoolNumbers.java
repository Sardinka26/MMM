package Module_10;

import java.util.*;

public class TestCoolNumbers {
    private static Scanner scanner = new Scanner(System.in);
    private static CoolNumbers coolNumbers = new CoolNumbers();
    private static final String MESSAGE_USER_INPUT_AUTO_NUMBER = "Введите ГосНомер автомобиля: ";
    private static final String ANSWER_SYSTEM_ERROR = "Номер НЕ найден: ";
    private static final String ANSWER_SYSTEM = "Номер найден! ";
    private static final String ANSWER_SYSTEM_TIME = "Поиск занял: ";
    private static final String ANSWER_SYSTEM_SEARCH_ARRAY_LIST = "Поиск перебором: ";
    private static final String ANSWER_SYSTEM_SEARCH_BINARY = "Бинарный поиск : ";
    private static final String ANSWER_SYSTEM_SEARCH_HASH_SET = "Поиск в HashSet: ";
    private static final String ANSWER_SYSTEM_SEARCH_TREE_SET = "Поиск в TreeSet: ";

    public static void main(String[] args) {
        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            String inputAutoNumberUser = scanner.nextLine();
            List<String> listGenerated = CoolNumbers.generateCoolNumbers();

            long startTime1 = System.nanoTime();
            if (!CoolNumbers.bruteForceSearchInList(listGenerated, inputAutoNumberUser)) {

                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime1) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime1) + " " + "нс");
            }

            Collections.sort(listGenerated);
            long startTime2 = System.nanoTime();
            if (!CoolNumbers.binarySearchInList(listGenerated, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime2) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime2) + " " + "нс");
            }


            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            long startTime3 = System.nanoTime();
            if (!CoolNumbers.searchInHashSet(listHashSet, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime3) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime3) + " " + "нс");
            }

            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            long startTime4 = System.nanoTime();
            if (!CoolNumbers.searchInTreeSet(listTreeSet, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime4) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME
                        + (System.nanoTime() - startTime4) + " " + "нс");
            }

            System.out.println();
        }
    }
}

