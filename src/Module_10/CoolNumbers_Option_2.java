package Module_10;

import java.util.*;

public class CoolNumbers_Option_2 {
    private static final String[] LETTERS = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};


    public static List<String> generateCoolNumbers() {
        ArrayList<String> listNumber = new ArrayList<>();

        for (int i = 0; i < LETTERS.length; i++) {
            for (int l = 0; l < LETTERS.length; l++) {
                for (int s = 0; s < LETTERS.length; s++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 1; k <= 199; k++) {
                            String letter1 = LETTERS[i];
                            String letter2 = LETTERS[l];
                            String letter3 = LETTERS[s];
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
                return true;
            } else {
            }
        }
        return false;

    }


    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }


    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return (treeSet.contains(number));
    }

}

