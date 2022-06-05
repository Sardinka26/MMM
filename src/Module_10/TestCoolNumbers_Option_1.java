package Module_10;

import java.util.*;

public class TestCoolNumbers_Option_1 {
    private static Scanner scanner = new Scanner(System.in);
    private static CoolNumbers_Option_1 coolNumbers = new CoolNumbers_Option_1();
    private static final String MESSAGE_USER_INPUT_AUTO_NUMBER = "Введите ГосНомер автомобиля: ";
    private static final String ANSWER_SYSTEM_TIME = "Поиск занял: ";

    public static void main(String[] args) {
        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            String inputAutoNumberUser = scanner.nextLine();
            List<String> listGenerated = CoolNumbers_Option_1.generateCoolNumbers();

            long startTime1 = System.nanoTime();
            System.out.println(CoolNumbers_Option_1.bruteForceSearchInList(listGenerated, inputAutoNumberUser) + (System.nanoTime() - startTime1) + " " + "нс");


            Collections.sort(listGenerated);
            long startTime2 = System.nanoTime();
            System.out.println(CoolNumbers_Option_1.binarySearchInList(listGenerated, inputAutoNumberUser) + (System.nanoTime() - startTime2) + " " + "нс");


            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            long startTime3 = System.nanoTime();
            System.out.println(CoolNumbers_Option_1.searchInHashSet(listHashSet, inputAutoNumberUser) + (System.nanoTime() - startTime3) + " " + "нс");



            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            long startTime4 = System.nanoTime();
            System.out.println(CoolNumbers_Option_1.searchInTreeSet(listTreeSet, inputAutoNumberUser) + (System.nanoTime() - startTime4) + " " + "нс");

            System.out.println();
        }
    }
}

