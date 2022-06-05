package Module_11;

import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        LocalDate dateAmountPut = LocalDate.now();
        lastIncome = dateAmountPut;
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        LocalDate dateAmountTake = LocalDate.now();
        Period period = Period.between(lastIncome, dateAmountTake);
        int countMonths = period.getMonths();
        int countYear = period.getYears();

        if (amountToTake < super.getAmount() && countMonths >= 1 ||
                amountToTake < super.getAmount() && countYear >= 1) {
            double balanceDeposit = super.getAmount() - amountToTake;
            super.setBalance(balanceDeposit);
        }
    }
}




