package Module_11_Company;

public class TEST {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Иван", "Петров", 200);
        TopManager topManager1 = new TopManager("Петя","Иванов",500);
        Operator operator1 = new Operator("Маша","Сидорова",100);
        Company company1 = new Company();
        System.out.println(company1.getIncomeCompany());
    }
}
