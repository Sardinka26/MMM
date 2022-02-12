package Encapsulation_04.Copy_04;

public class Test {
    public static void main(String[] args) {
        Dimensions dimensions1 = new Dimensions(20.0, 20.0, 20.0);
        InfoBase infoBase1 = new InfoBase(dimensions1, 50, "Москва", true, "155", false);
        System.out.println(infoBase1);

        InfoBase infoBase2 = infoBase1.setDeliveryAddress("Питер").setWeight(40);
        System.out.println();
        System.out.println(infoBase2);
        System.out.println();

        Dimensions dimensions2 = dimensions1.setWidthHeightLength(10, 10, 10);
        InfoBase infoBase3 = infoBase1.setDimensions(dimensions2);
        System.out.println();
        System.out.println(infoBase3);


    }
}