package ObjectsAndMethods_03.Arithmetic;

public class Test {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(55,10);
        System.out.println(" Сумма чисел равна : " + arithmetic.sum());
        System.out.println(" Произведение чисел равно : " + arithmetic.multiplication());
        System.out.println(" Максимальное число : " + arithmetic.max());
        System.out.println(" Минимальное число : " + arithmetic.min());
    }
}
