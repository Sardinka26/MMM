package StaticFinal_05.enum_02;

public class TestEnum {
    public static void main(String[] args) {

        ArithmeticCalculator arithmetic = new ArithmeticCalculator(5,2);
        System.out.println(arithmetic.calculate(Operation.ADD));
        System.out.println(arithmetic.calculate(Operation.SUBTRACT));
        System.out.println(arithmetic.calculate(Operation.MULTIPLY));


    }
}
