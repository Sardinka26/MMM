package Encapsulation_04.Copy_04;

public final class InfoBase {
    private final Dimensions dimensions;
    private double weight;
    private String deliveryAddress;
    private boolean ofTurnOver;
    private String registrationNumber;
    private boolean ofFragile;

    public InfoBase(Dimensions dimension, double weight, String deliveryAddress, boolean ofTurnOver, String registrationNumber, boolean ofFragile) {
        this.dimensions = dimension;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.ofTurnOver = ofTurnOver;
        this.registrationNumber = registrationNumber;
        this.ofFragile = ofFragile;
    }

    public InfoBase setDeliveryAddress(String deliveryAddress) {
        return new InfoBase(dimensions, weight, deliveryAddress, ofTurnOver, registrationNumber, ofFragile);
    }

    public InfoBase setWeight(double weight) {
        return new InfoBase(dimensions, weight, deliveryAddress, ofTurnOver, registrationNumber, ofFragile);
    }

    public InfoBase setDimensions(Dimensions dimension) {
        return new InfoBase(dimension, weight, deliveryAddress, ofTurnOver, registrationNumber, ofFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isOfTurnOver() {
        return ofTurnOver;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isOfFragile() {
        return ofFragile;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return "Габарит груза : " + "\n"
                + "- Высота : " + dimensions.getHeight() + "\n"
                + "- Длина  : " + dimensions.getLength() + "\n"
                + "- Ширина : " + dimensions.getWidth() + "\n" +
                "Вес груза : " + weight + "\n" +
                "Адрес доставки : " + deliveryAddress + "\n" +
                "Можно переворачивать : " + ofTurnOver + "\n" +
                "Регистрационный номер : " + registrationNumber + "\n" +
                "Хрупкий : " + ofFragile + "\n" +
                "Объем груза " + dimensions.cargoVolume(dimensions);

    }


}


