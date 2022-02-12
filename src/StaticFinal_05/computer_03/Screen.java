package StaticFinal_05.computer_03;

public class Screen {

    private final double DIAGONAL_SCREEN;
    private final String TYPE_SCREEN;
    private final double WEIGHT_SCREEN;

    public Screen(double DIAGONAL_SCREEN, String TYPE_SCREEN, double WEIGHT_SCREEN) {
        this.DIAGONAL_SCREEN = DIAGONAL_SCREEN;
        this.TYPE_SCREEN = TYPE_SCREEN;
        this.WEIGHT_SCREEN = WEIGHT_SCREEN;
    }

    public double getDIAGONAL_SCREEN() {
        return DIAGONAL_SCREEN;
    }

    public String getTYPE_SCREEN() {
        return TYPE_SCREEN;
    }

    public double getWEIGHT_SCREEN() {
        return WEIGHT_SCREEN;
    }
}
