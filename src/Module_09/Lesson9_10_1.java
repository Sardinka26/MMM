package Module_09;

public class Lesson9_10_1 {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    public static String getSalary(String text) {
        int salary = 0;
        String str1 = "заработал ";
        int start1 = text.indexOf(str1) + str1.length() ;
        int end1 = text.indexOf(" рублей", start1);

        String str2 = "Петя - ";
        int start2 = text.indexOf(str2) + str2.length() ;
        int end2 = text.indexOf("рубля", start2);

        String str3 = "Маша - ";
        int start3 = text.indexOf(str3) + str3.length();
        int end3 = text.lastIndexOf("рублей");

        String xxx = text.substring(start1, end1).trim() + " " + text.substring(start2, end2).trim() + " " + text.substring(start3,end3).trim() ;
        int piece1 = Integer.parseInt(text.substring(start1, end1).trim());
        int piece2 = Integer.parseInt(text.substring(start2, end2).trim());
        int piece3 = Integer.parseInt(text.substring(start3,end3).trim());
        salary = piece1 + piece2 + piece3;
        String str = String.valueOf(salary);
        return str;
    }


    public static void main(String[] args) {

        System.out.println(getSalary("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));
}
}









