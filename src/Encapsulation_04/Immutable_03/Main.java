package Encapsulation_04.Immutable_03;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(" Шоколад","125478");
        product.setPrice(50);
        System.out.println(product.toString());
        System.out.println(product.getBarCode());
        System.out.println(product.getName());
        System.out.println(product.getPrice());

    }
}
