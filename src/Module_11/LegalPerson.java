package Module_11;

public class LegalPerson extends Client {

    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    public void take(double amountToTake) {
        super.take(amountToTake + ((amountToTake * 1) / 100));
    }
}
