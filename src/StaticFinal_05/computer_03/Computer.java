package  StaticFinal_05.computer_03;

public class Computer {
    private Processor processor;
    private ComputerRAM computerRAM;
    private InformationStorage informationStorage;
    private Screen screen;
    private Keyboard keyboard;
    private double totalWeightComputer;
    private final String VENDOR;
    private final String NAME;

    public Computer(Processor processor, ComputerRAM computerRAM, InformationStorage informationStorage, Screen screen, Keyboard keyboard, double totalWeightComputer, String VENDOR, String NAME) {
        this.processor = processor;
        this.computerRAM = computerRAM;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.totalWeightComputer = totalWeightComputer;
        this.VENDOR = VENDOR;
        this.NAME = NAME;
    }

    public void addTotalWeightComputer(){
        totalWeightComputer = processor.getWEIGHT_PROCESSOR() + computerRAM.getWEIGHT_RAM() + informationStorage.getWEIGHT_STORAGE() + screen.getWEIGHT_SCREEN() + keyboard.getWEIGHT_KEYBOARD();
    }

    @Override
    public String toString() {
        return  " Производитель: " + VENDOR + "\n" +
                " Название:      " + NAME + "\n" +
                "                " + "\n" +
                " Процессор : " + "\n" +
                "             частота: "  + processor.getFREQUENCY_CPU()  + "\n" +
                "             количество ядер: " + processor.getCOUNT_CORES()  + "\n" +
                "             производитель RAM: " + processor.getVENDOR_WEIGHT_PROCESSOR() + "\n" +
                "             вес RAM: " + processor.getWEIGHT_PROCESSOR() + "\n" +
                " Оперативная память: " + "\n" +
                "             тип: "  + computerRAM.getTYPE_RAM()  + "\n" +
                "             объём: " + computerRAM.getVOLUME_RAM()  + "\n" +
                "             вес: " + computerRAM.getWEIGHT_RAM() + "\n" +
                " Накопитель информации: " + "\n" +
                "             тип: "  + informationStorage.getTYPE_STORAGE()  + "\n" +
                "             объём памяти: " + informationStorage.getVOLUME_STORAGE()  + "\n" +
                "             вес: " + informationStorage.getWEIGHT_STORAGE() + "\n" +
                " Экран: " + "\n" +
                "             диагогаль: "  + screen.getDIAGONAL_SCREEN()  + "\n" +
                "             тип: " + screen.getTYPE_SCREEN()  + "\n" +
                "             вес: " + screen.getWEIGHT_SCREEN() + "\n" +
                " Клавиатура: " + "\n" +
                "             тип: "  + keyboard.getTYPE_KEYBOARD()  + "\n" +
                "             наличие подсветки: " + keyboard.isBACKLIGHT_KEYBOARD()  + "\n" +
                "             вес: " + keyboard.getWEIGHT_KEYBOARD();


    }

    public String getVENDOR() {
        return VENDOR;
    }

    public String getNAME() {
        return NAME;
    }

    public Processor getProcessor() {
        return processor;
    }

    public ComputerRAM getComputerRAM() {
        return computerRAM;
    }

    public InformationStorage getInformationStorage() {
        return informationStorage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setComputerRAM(ComputerRAM computerRAM) {
        this.computerRAM = computerRAM;
    }

    public void setInformationStorage(InformationStorage informationStorage) {
        this.informationStorage = informationStorage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeightComputer() {
        return totalWeightComputer;
    }

    public void setTotalWeightComputer(double totalWeightComputer) {
        this.totalWeightComputer = totalWeightComputer;
    }
}
