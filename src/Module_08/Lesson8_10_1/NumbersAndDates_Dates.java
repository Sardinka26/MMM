package Module_08.Lesson8_10_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class NumbersAndDates_Dates {

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        StringBuilder text = new StringBuilder();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EE", Locale.US);
        int age = 0;

        while (birthday.isBefore(today) || birthday.equals(today)) {

            text.append(age + " - " + birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) + " - " + dateTimeFormatter.format(birthday.getDayOfWeek()) + System.lineSeparator());
            birthday = birthday.plusYears(1);
            age++;
        }

        return text.toString();
    }

    public static void main(String[] args) {
        System.out.println(collectBirthdays(2020, 12, 22));
    }
}



