package Module_10;

import java.util.*;

public class TestCoolNumbers_Option_2 {

    private static Scanner scanner = new Scanner(System.in);
    private static final String MESSAGE_USER_INPUT_AUTO_NUMBER = "Введите ГосНомер автомобиля: ";
    private static final String ANSWER_SYSTEM_TIME = "Поиск занял: ";
    private static final String ANSWER_SYSTEM_SEARCH_ARRAY_LIST = "Поиск перебором: ";
    private static final String ANSWER_SYSTEM_ERROR = "Номер НЕ найден: ";
    private static final String ANSWER_SYSTEM = "Номер найден! ";
    private static final String ANSWER_SYSTEM_SEARCH_BINARY = "Бинарный поиск : ";
    private static final String ANSWER_SYSTEM_SEARCH_HASH_SET = "Поиск в HashSet: ";
    private static final String ANSWER_SYSTEM_SEARCH_TREE_SET = "Поиск в TreeSet: ";

    public static void main(String[] args) {

        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            List<String> listGenerated = CoolNumbers_Option_2.generateCoolNumbers();
            String inputAutoNumberUser = scanner.nextLine();

            long startTime1 = System.nanoTime();
            if (!CoolNumbers_Option_2.bruteForceSearchInList(listGenerated, inputAutoNumberUser)) {
                ptint(ANSWER_SYSTEM_SEARCH_ARRAY_LIST, ANSWER_SYSTEM_ERROR, startTime1);
            } else {
                ptint(ANSWER_SYSTEM_SEARCH_ARRAY_LIST, ANSWER_SYSTEM, startTime1);
            }

            Collections.sort(listGenerated);
            long startTime2 = System.nanoTime();
            if (!CoolNumbers_Option_2.binarySearchInList(listGenerated, inputAutoNumberUser)) {
                TestCoolNumbers_Option_2.ptint(ANSWER_SYSTEM_SEARCH_BINARY, ANSWER_SYSTEM_ERROR, startTime2);
            } else {
                ptint(ANSWER_SYSTEM_SEARCH_BINARY, ANSWER_SYSTEM, startTime2);
            }

            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            long startTime3 = System.nanoTime();
            if (!CoolNumbers_Option_2.searchInHashSet(listHashSet, inputAutoNumberUser)) {
                ptint(ANSWER_SYSTEM_SEARCH_HASH_SET, ANSWER_SYSTEM_ERROR, startTime3);
            } else {
                ptint(ANSWER_SYSTEM_SEARCH_BINARY, ANSWER_SYSTEM, startTime3);
            }

            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            long startTime4 = System.nanoTime();
            if (!CoolNumbers_Option_2.searchInTreeSet(listTreeSet, inputAutoNumberUser)) {
                ptint(ANSWER_SYSTEM_SEARCH_TREE_SET, ANSWER_SYSTEM_ERROR, startTime4);
            } else {
                ptint(ANSWER_SYSTEM_SEARCH_TREE_SET, ANSWER_SYSTEM, startTime4);
            }

        }

    }

    public static void ptint(String TYPE_ANSWER, String answerTime, long time) {
        System.out.println(TYPE_ANSWER + answerTime + ANSWER_SYSTEM_TIME + (System.nanoTime() - time) + " " + "нс");
    }
}




