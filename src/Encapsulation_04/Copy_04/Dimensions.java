package Encapsulation_04.Copy_04;

public final class Dimensions {
    private double width;
    private double height;
    private double length;

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double cargoVolume(Dimensions dimensions) {
        return width * height * length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public Dimensions setWidthHeightLength(double width, double height, double length) {
        return new Dimensions(width, height, length);
    }


}
