package Module_11_Company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class TEST {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager());
        employees.add(new TopManager());
        employees.add(new Operator());
        employees.add(new Manager());
        employees.add(new TopManager());
        employees.add(new Operator());
        Company company = new Company(employees);



        System.out.println(company.getEmployees());



    }
}
