package Module_10;

import java.util.*;

public class CoolNumbers {
    private static final String ANSWER_SYSTEM_ERROR = "Номер НЕ найден: ";
    private static final String ANSWER_SYSTEM = "Номер найден! ";
    private static final String ANSWER_SYSTEM_SEARCH_ARRAY_LIST = "Поиск перебором: ";
    private static final String ANSWER_SYSTEM_SEARCH_BINARY = "Бинарный поиск : ";
    private static final String ANSWER_SYSTEM_SEARCH_HASH_SET = "Поиск в HashSet: ";
    private static final String ANSWER_SYSTEM_SEARCH_TREE_SET = "Поиск в TreeSet: ";

    public static List<String> generateCoolNumbers() {
        ArrayList<String> listNumber = new ArrayList<>();
        final String[] letters = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        for (int i = 0; i < letters.length; i++) {
            for (int l = 0; l < letters.length; l++) {
                for (int s = 0; s < letters.length; s++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 1; k <= 199; k++) {
                            String letter1 = letters[i];
                            String letter2 = letters[l];
                            String letter3 = letters[s];
                            String region = String.valueOf(k);
                            if (k < 10) {
                                region = "0" + region;
                            }
                            String number = String.format("%s%d%d%d%s%s%s", letter1, j, j, j, letter2, letter3, region);
                            listNumber.add(number);
                        }
                    }
                }
            }
        }
        return listNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(number)) {
                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM);
                return true;
            } else {
                System.out.println(ANSWER_SYSTEM_SEARCH_ARRAY_LIST + ANSWER_SYSTEM_ERROR);
            }
        }
        return false;
    }


    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (Collections.binarySearch(sortedList, number) >= 0) {
            System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM);
            return true;
        } else {
            System.out.println(ANSWER_SYSTEM_SEARCH_BINARY + ANSWER_SYSTEM_ERROR);
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        if (hashSet.contains(number)) {
            System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM);
            return true;
        } else {
            System.out.println(ANSWER_SYSTEM_SEARCH_HASH_SET + ANSWER_SYSTEM_ERROR);
        }
        return false;
    }


    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (treeSet.contains(number)) {
            System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM);
            return true;
        } else {
            System.out.println(ANSWER_SYSTEM_SEARCH_TREE_SET + ANSWER_SYSTEM_ERROR);
        }
        return false;
    }

}


