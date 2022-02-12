package StaticFinal_05.enum_02;

public class TestBasket {

    public static void main(String[] args) {
        Basket basket1 = new Basket(100);
        basket1.add("Молоко", 10, 2);
        Basket basket2 = new Basket(1000);
        basket2.add("Сахар", 5);
        basket2.add("Перец", 10, 2);
        Basket basket3 = new Basket("Просто строка ",200);
       // basket2.clear();

        System.out.println(" 1) Количество корзин : " + Basket.getCountAllBasket());
        System.out.println(" 2) тотал прайс корзин : " + basket1.getTotalPrice() + " " + basket2.getTotalPrice() + " " + basket3.getTotalPrice());
        System.out.println(" 3) количество товаров в одной корзине : " + basket1.getCountProductOneBasket() + " " + basket2.getCountProductOneBasket() + " " + basket3.getCountProductOneBasket());
        System.out.println(" 4) Общее колчество товаров во всех корзинах : " + Basket.getTotalAllCountProductAllBasket());
        System.out.println(" 5) Общая стоимость всех корзин : " + Basket.getTotalPriceAllBasket());
        System.out.println(" 6) Средняя цена товара во всех корзинах : " + Basket.calculateAveragePriceProductInAllBasket());
        System.out.println(" 7) Средняя стоимость корзины : " + Basket.calculateAveragePriceBasket());


    }
}
