package Module_08.Lesson8_10_2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class NumbersAndDates_Periods {

    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        Period period = Period.between(firstDate, secondDate);
        return "years:" + period.getYears() + "," + " months:" + period.getMonths() + "," + " days:" + period.getDays();
    }

    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2021, Month.DECEMBER, 22);
        LocalDate secondDate = LocalDate.now();
        System.out.println(getPeriodFromBirthday(firstDate, secondDate));

    }
}



