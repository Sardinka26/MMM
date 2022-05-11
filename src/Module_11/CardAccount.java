package Module_11;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        if (amountToTake > 0 && amountToTake < balance) {
            balance = balance - (amountToTake + ((amountToTake * 1) / 100));
        }
    }
}
