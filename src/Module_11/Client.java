package Module_11;

public abstract class Client {
    private double balance = 0.0;

    public double getBalance() {
        return balance;

    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            balance = balance + amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake < balance) {
            balance = balance - amountToTake;
        }
    }

}
