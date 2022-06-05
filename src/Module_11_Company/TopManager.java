package Module_11_Company;

public class TopManager implements Employee,Comparable<TopManager>{
    private double salary;
    double monthSalary;
    private Company company;

    public TopManager(double salary) {
        this.salary = salary;

    }

    @Override
    public double getMonthSalary() {
        if(company.getIncomeCompany() > 10_000_000){
            monthSalary = salary + ((company.getIncomeCompany() * 150) / 100);
        }
        return monthSalary;
    }

    @Override
    public int compareTo(TopManager o) {
        return (int) (Math.round(getMonthSalary()) - (Math.round(o.getMonthSalary())));
    }
}

