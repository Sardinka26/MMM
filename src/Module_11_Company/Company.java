package Module_11_Company;

public class Company {

    private int countEmployee = 0;
    private double incomeCompany;

    public int getCountEmployee() {
        return countEmployee;
    }

    public double getIncomeCompany() {
        return incomeCompany = Math.random() * 150_000_000;
    }

}
