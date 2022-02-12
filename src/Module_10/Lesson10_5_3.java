package Module_10;

public class Lesson10_5_3 {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i == j) {

                    array[i][j] = SYMBOL;

                } else if (i + j == array.length - 1) {

                    array[i][j] = SYMBOL;

                } else array[i][j] = ' ';

            }
        }
        return array;
    }
}


