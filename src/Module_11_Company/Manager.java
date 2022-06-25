package Module_11_Company;

import java.util.Comparator;
import java.util.List;

public class Manager implements Employee, Comparable<Manager> {

    private double salary;
    private double monthSalary;
    private double salesOfManager;
    private Company company;

    public Manager() {
        earnMonthSalary();
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
    public void earnMonthSalary() {
        salary = Math.random() * (100_000 - 50_000) + 50_000;
        salesOfManager = Math.random() * (140000 - 115000) + 115000;
        monthSalary = salary + ((salesOfManager * 5) / 100);
    }

    @Override
    public void createNewEmployee(int count) {
        for (int i = 0; i <= count; i++) {
            company.getEmployees().add(new Manager());
        }
    }


    public double getSalary() {
        return getSalary();
    }

    @Override
    public int compareTo(Manager o) {
        return (int)
                (Math.round(this.getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }

}

