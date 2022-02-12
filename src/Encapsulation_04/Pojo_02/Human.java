package Encapsulation_04.Pojo_02;

public class Human {
    private String name;
    private int age;
    private String colorHair;
    private double sizeFoot;
    private boolean education;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    public double getSizeFoot() {
        return sizeFoot;
    }

    public void setSizeFoot(double sizeFoot) {
        this.sizeFoot = sizeFoot;
    }

    public boolean isEducation() {
        return education;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }
}
