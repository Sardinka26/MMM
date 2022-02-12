package Encapsulation_04.Immutable_03;

public class Product {
    private final String name;
    private int price;
    private final String barCode;

    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }
    public String getName() {
        return name;
    }
    public String getBarCode() {
        return barCode;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return " / товар = " + name + " / цена = " + price + " / штрихКод = " + barCode;
    }
}
