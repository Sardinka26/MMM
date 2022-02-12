package Module_09;

public class Lesson9_10_1_option_2 {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    public static int getSalary(String text) {

        int start = 0;
         int result = 0;

        while ((start = text.indexOf(" руб", start)) != -1) {

            int end = text.lastIndexOf(' ', start - 1);

            result += Integer.parseInt(text.substring(end + 1, start++));

        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println(getSalary("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));
    }
}

