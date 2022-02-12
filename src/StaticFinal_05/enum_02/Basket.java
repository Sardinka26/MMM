package StaticFinal_05.enum_02;

public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private static int totalAllCountProductAllBasket;      // общее количество продуктов во всех корзинах
    private static double totalPriceAllBasket;// общая стоимость всех корзин
    private static int countAllBasket = 0;               // количество корзин
    private int countProductOneBasket;    // количество продуктов в одной корзине

    public int getCountProductOneBasket() {
        return countProductOneBasket;
    }

    public static int getCountAllBasket() {
        return countAllBasket;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalAllCountProductAllBasket() {
        return totalAllCountProductAllBasket;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public static double getTotalPriceAllBasket() {
        return totalPriceAllBasket;
    }

    public Basket() {
        items = "Список товаров:";
        this.limit = 1000000;
        increaseCountAllBasket();                             // Общее количество корзин
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        Basket.totalPriceAllBasket += totalPrice;
        Basket.totalAllCountProductAllBasket++;
        countProductOneBasket++;
    }

    public static void increaseCountAllBasket() {
        Basket.countAllBasket++;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {

        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        countProductOneBasket += count;
        Basket.totalAllCountProductAllBasket += count;      // общее количество продуктов во всех корзинах
        Basket.totalPriceAllBasket += count * price;
    }

    public static double calculateAveragePriceBasket() {                   // средняя стоимость корзины
        return Basket.totalPriceAllBasket / Basket.totalAllCountProductAllBasket;

    }

    public static double calculateAveragePriceProductInAllBasket() {                  // Средняя цена товара во всех корзинах
        return Basket.totalPriceAllBasket / Basket.countAllBasket;
    }

    public void clear() {
        items = "";
        Basket.totalPriceAllBasket = totalPriceAllBasket - totalPrice;
        totalPrice = 0;
        Basket.totalAllCountProductAllBasket = totalAllCountProductAllBasket - countProductOneBasket;
        countProductOneBasket = 0;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

