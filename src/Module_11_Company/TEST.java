package Module_11_Company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TEST {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager(250));
        employees.add(new TopManager(500));
        employees.add(new Operator(100));
        employees.add(new Manager(300));
        employees.add(new TopManager(700));
        employees.add(new Operator(1500));
        Company company = new Company(employees);


        System.out.println(company);


    }
}
