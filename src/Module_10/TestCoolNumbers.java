package Module_10;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

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
    static long timeArray1 = System.nanoTime();
    static long timeArray2 = System.nanoTime();
    static long timeArray3 = System.nanoTime();
    static long timeArray4 = System.nanoTime();

    public static void main(String[] args) {

        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            String inputAutoNumberUser = scanner.nextLine();
            List<String> listGenerated = CoolNumbers.generateCoolNumbers();
            CoolNumbers.bruteForceSearchInList(listGenerated, inputAutoNumberUser);

            if (!CoolNumbers.bruteForceSearchInList(listGenerated, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray1) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray1) + " " + "нс");
            }
            if (!CoolNumbers.binarySearchInList(listGenerated, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray2) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray2) + " " + "нс");
            }
            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            if (!CoolNumbers.searchInHashSet(listHashSet, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray3) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray3) + " " + "нс");
            }
            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            if (!CoolNumbers.searchInTreeSet(listTreeSet, inputAutoNumberUser)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM_ERROR + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray4) + " " + "нс");
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM + " " + ANSWER_SYSTEM_TIME + (System.nanoTime() - timeArray4) + " " + "нс");
            }
            System.out.println();
        }
    }
}
