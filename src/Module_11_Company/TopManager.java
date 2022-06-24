package Module_11_Company;

public class TopManager implements Employee, Comparable<TopManager> {
    private double salary;
    private double monthSalary;
    private Company company;

    public TopManager() {
        this.monthSalary = earnMonthSalary();
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    public double earnMonthSalary() {
        salary = Math.random() * (250_000 - 150_000) + 150_000;
        if (company.getIncomeCompany() > 10_000_000) {
            monthSalary = salary + ((company.getIncomeCompany() * 150) / 100);
        }
        return monthSalary;
    }

    @Override
    public int compareTo(TopManager o) {
        return (int) (Math.round(this.getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }
}

