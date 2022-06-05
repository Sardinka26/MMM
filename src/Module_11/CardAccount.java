package Module_11;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        if (amountToTake > 0 && amountToTake < super.getAmount()) {
            double balanceCard = super.getAmount() - (amountToTake + ((amountToTake * 1) / 100));
             super.setBalance(balanceCard);
        }
    }
}
