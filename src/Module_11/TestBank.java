package Module_11;

public class TestBank {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(5000);
        depositAccount.take(500);


        bankAccount.put(1000);  // Положила на банковский счет
        System.out.println("Счет банка:" + bankAccount.getAmount());

        cardAccount.put(1000);  // Положила на карточный счет
        System.out.println("Счет карты:" + cardAccount.getAmount());
        cardAccount.take(100);   // Сняла с карточного счета
        System.out.println("Счет карты:" + cardAccount.getAmount());
    }

}
