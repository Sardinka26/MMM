package ObjectsAndMethods_03.Arithmetic;

public class Arithmetic {

    private int number1;
    private int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {
        return number1 + number2;
    }

    public int multiplication() {
        return number1 * number2;
    }

    public int min() {
        return number1 < number2 ? number1 : number2;
    }

    public int max() {
        return number1 > number2 ? number1 : number2;
    }
}

