package  StaticFinal_05.computer_03;

public class InformationStorage {
                                                 // накопитель информации
    private final String TYPE_STORAGE;
    private final int VOLUME_STORAGE;
    private final double WEIGHT_STORAGE;

    public InformationStorage(String TYPE_STORAGE, int VOLUME_STORAGE, double WEIGHT_STORAGE) {
        this.TYPE_STORAGE = TYPE_STORAGE;
        this.VOLUME_STORAGE = VOLUME_STORAGE;
        this.WEIGHT_STORAGE = WEIGHT_STORAGE;
    }

    public String getTYPE_STORAGE() {
        return TYPE_STORAGE;
    }

    public int getVOLUME_STORAGE() {
        return VOLUME_STORAGE;
    }

    public double getWEIGHT_STORAGE() {
        return WEIGHT_STORAGE;
    }
}
