package Module_11_Company;

public class Operator implements Employee,Comparable <Operator>{

    private double salary;
    double monthSalary;
    private Company company;

    public Operator(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public int compareTo(Operator o) {
        return (int) (Math.round(getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }
}
