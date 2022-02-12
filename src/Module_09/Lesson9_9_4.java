package Module_09;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson9_9_4 {

    public static String splitTextIntoWords(String text) {
        StringJoiner joiner = new StringJoiner(System.lineSeparator());
        Pattern pattern = Pattern.compile("([a-zA-Z]+\\’?)+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            joiner.add(matcher.group());
        }
        return joiner.toString();
    }


    public static void main(String[] args) {
        System.out.println(splitTextIntoWords(" This it's the-ten-years text I'm English, there! are+&^%#$#%%& 202 characters "));


    }
}
