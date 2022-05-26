package Module_11_Company;

public class Operator implements Employee{

    private String name;
    private String surname;
    private double salary;
    double monthSalary;
    private Company company;

    public Operator(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
