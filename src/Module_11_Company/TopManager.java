package Module_11_Company;

public class TopManager implements Employee{
    private String name;
    private String surname;
    private double salary;
    double monthSalary;
    private Company company;

    public TopManager(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        if(company.getIncomeCompany() > 10_000_000){
            monthSalary = salary + ((company.getIncomeCompany() * 150) / 100);
        }
        return monthSalary;
    }
}

