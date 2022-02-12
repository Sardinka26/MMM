package  StaticFinal_05.computer_03;

public class Keyboard {

    private final String TYPE_KEYBOARD;
    private final boolean BACKLIGHT_KEYBOARD;
    private final double WEIGHT_KEYBOARD;

    public Keyboard(String TYPE_KEYBOARD, boolean BACKLIGHT_KEYBOARD, double WEIGHT_KEYBOARD) {
        this.TYPE_KEYBOARD = TYPE_KEYBOARD;
        this.BACKLIGHT_KEYBOARD = BACKLIGHT_KEYBOARD;
        this.WEIGHT_KEYBOARD = WEIGHT_KEYBOARD;
    }

    public String getTYPE_KEYBOARD() {
        return TYPE_KEYBOARD;
    }

    public boolean isBACKLIGHT_KEYBOARD() {
        return BACKLIGHT_KEYBOARD;
    }

    public double getWEIGHT_KEYBOARD() {
        return WEIGHT_KEYBOARD;
    }
}
