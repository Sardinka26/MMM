package Module_11_Company;

public class Operator implements Employee, Comparable<Operator> {
    private double monthSalary;
    private Company company;

    public Operator() {
        this.monthSalary = 25_000;
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
    public void earnMonthSalary() {
    }

    @Override
    public void createNewEmployee(int count) {
        for (int i = 0; i <= count; i++) {
            company.getEmployees().add(new Operator());
        }
    }

    @Override
    public int compareTo(Operator o) {
        return (int) (Math.round(this.getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }
}
