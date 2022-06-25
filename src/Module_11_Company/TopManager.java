package Module_11_Company;

public class TopManager implements Employee, Comparable<TopManager> {
    private double salary;
    private double monthSalary;
    private Company company;

    public TopManager() {
        earnMonthSalary();
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    public void earnMonthSalary() {
        salary = Math.random() * (250_000 - 150_000) + 150_000;
        if (company.calculateIncomeCompany() > 10_000_000) {
            monthSalary = salary + ((company.getIncomeCompany() * 150) / 100);
        }
    }

    @Override
    public void createNewEmployee(int count) {
        for (int i = 0; i <= count; i++) {
            company.getEmployees().add(new TopManager());
        }
    }

    @Override
    public int compareTo(TopManager o) {
        return (int) (Math.round(this.getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }
}

