package Module_11_Company;
import java.util.Collections;
import java.util.List;

public class Company {
    private double incomeCompany;
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public double getIncomeCompany() {
        return incomeCompany;
    }
    public double calculateIncomeCompany() {
        return incomeCompany = Math.random() * 150_000_000;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void hireAllEmployee(List listEmployee) {
        employees.addAll(listEmployee);
    }
    public void hireEmployee(Employee emp) {
        employees.add(emp);
    }
    public void fireEmployee(Employee emp) {
        employees.remove(emp);
    }
    List<Employee> getTopSalaryStaff(int count){
        return employees;
    }

    @Override
    public String toString() {
        return "Доход компании = " + getIncomeCompany() + "\n" +
                "Работники компании : " + getEmployees();
    }


}

