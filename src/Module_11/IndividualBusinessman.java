package Module_11;

public class IndividualBusinessman extends Client {

    public void put(double amountToPut) {
        if (amountToPut < 1000) {
            super.put(amountToPut - ((amountToPut * 1) / 100));
        }
        if (amountToPut >= 1000) {
            super.put(amountToPut - ((amountToPut * 0.5) / 100));
        }

    }

    public void take(double amountToTake) {
        super.take(amountToTake + ((amountToTake * 1) / 100));
    }
}
