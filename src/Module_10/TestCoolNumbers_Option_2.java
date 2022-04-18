package Module_10;

import java.util.*;

public class TestCoolNumbers_Option_2 {

    private static Scanner scanner = new Scanner(System.in);
    private static final String MESSAGE_USER_INPUT_AUTO_NUMBER = "Введите ГосНомер автомобиля: ";

    public static void main(String[] args) {

        while (true) {
            System.out.print(MESSAGE_USER_INPUT_AUTO_NUMBER + System.lineSeparator());
            List<String> listGenerated = CoolNumbers_Option_2.generateCoolNumbers();
            String inputAutoNumberUser = scanner.nextLine();

            CoolNumbers_Option_2.bruteForceSearchInList(listGenerated, inputAutoNumberUser);
            Collections.sort(listGenerated);
            CoolNumbers_Option_2.binarySearchInList(listGenerated, inputAutoNumberUser);

            HashSet<String> listHashSet = new HashSet<>(listGenerated);
            CoolNumbers_Option_2.searchInHashSet(listHashSet, inputAutoNumberUser);

            TreeSet<String> listTreeSet = new TreeSet<>(listGenerated);
            CoolNumbers_Option_2.searchInTreeSet(listTreeSet, inputAutoNumberUser);

        }

    }
}




