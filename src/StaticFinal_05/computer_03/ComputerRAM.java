package  StaticFinal_05.computer_03;

public class ComputerRAM {                     // оперативная память
     private final String TYPE_RAM;
     private final int VOLUME_RAM;
     private final double WEIGHT_RAM;

    public ComputerRAM(String TYPE_RAM, int VOLUME_RAM, double WEIGHT_RAM) {
        this.TYPE_RAM = TYPE_RAM;
        this.VOLUME_RAM = VOLUME_RAM;
        this.WEIGHT_RAM = WEIGHT_RAM;
    }

    public String getTYPE_RAM() {
        return TYPE_RAM;
    }

    public int getVOLUME_RAM() {
        return VOLUME_RAM;
    }

    public double getWEIGHT_RAM() {
        return WEIGHT_RAM;
    }
}

