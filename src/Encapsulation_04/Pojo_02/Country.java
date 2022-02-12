package Encapsulation_04.Pojo_02;

public class Country {
    private String nameCountry;
    private int countPopulation;
    private double countSquare;
    private String nameCapital;
    private boolean roadToTheSea;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getCountPopulation() {
        return countPopulation;
    }

    public void setCountPopulation(int countPopulation) {
        this.countPopulation = countPopulation;
    }

    public double getCountSquare() {
        return countSquare;
    }

    public void setCountSquare(double countSquare) {
        this.countSquare = countSquare;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean IsRoadToTheSea() {
        return roadToTheSea;
    }

    public void setRoadToTheSea(boolean roadToTheSea) {
        this.roadToTheSea = roadToTheSea;
    }
}
