package StaticFinal_05.computer_03;

public class TestComputer {
    public static void main(String[] args) {
        Processor processor1 = new Processor(50, 8, "Оло-ло", 10);
        ComputerRAM computerRAM1 = new ComputerRAM("BBB", 50, 10);
        InformationStorage informationStorage1 = new InformationStorage("ЛЛЛ", 45, 10);
        Screen screen1 = new Screen(110, "ССС", 10);
        Keyboard keyboard1 = new Keyboard("Что то там", true, 10);

        Computer computer1 = new Computer(processor1, computerRAM1, informationStorage1, screen1, keyboard1,
                100, "Sony", "VivoBook");
        computer1.addTotalWeightComputer();
        System.out.println(computer1.toString());
    }
}
