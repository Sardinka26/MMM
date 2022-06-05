package Module_11_Company;
import java.util.Comparator;
import java.util.List;

public class Manager implements Employee,Comparable <Manager> {

    private double salary;
    private double monthSalary;
    private double salesOfManager;
    private Company company;

    public Manager(double salary) {
        this.salary = salary;

    }
    @Override
    public double getMonthSalary() {
        salesOfManager = Math.random() * (140000 - 115000) + 115000;
        return monthSalary = salary + ((salesOfManager * 5) / 100);
    }

    @Override
    public int compareTo(Manager o) {
        return (int) (Math.round(getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }

}

