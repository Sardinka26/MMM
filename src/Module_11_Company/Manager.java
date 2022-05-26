package Module_11_Company;

public class Manager implements Employee {
    private String name;
    private String surname;
    private double salary;
    private double monthSalary;
    private double salesOfManager;
    private Company company;

    public Manager(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }

    @Override
    public double getMonthSalary() {
        salesOfManager = Math.random() * (140000 - 115000) + 115000;
        return monthSalary = salary + ((salesOfManager * 5) / 100);
    }
}
