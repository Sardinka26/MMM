package  StaticFinal_05.computer_03;

public class Processor {

    private final double FREQUENCY_CPU;
    private final int COUNT_CORES;
    private final String VENDOR_WEIGHT_PROCESSOR;
    private final double WEIGHT_PROCESSOR;

    public Processor(double FREQUENCY_CPU, int COUNT_CORES, String VENDOR_WEIGHT_PROCESSOR, double WEIGHT_PROCESSOR) {
        this.FREQUENCY_CPU = FREQUENCY_CPU;
        this.COUNT_CORES = COUNT_CORES;
        this.VENDOR_WEIGHT_PROCESSOR = VENDOR_WEIGHT_PROCESSOR;
        this.WEIGHT_PROCESSOR = WEIGHT_PROCESSOR;
    }

    public double getFREQUENCY_CPU() {
        return FREQUENCY_CPU;
    }

    public int getCOUNT_CORES() {
        return COUNT_CORES;
    }

    public String getVENDOR_WEIGHT_PROCESSOR() {
        return VENDOR_WEIGHT_PROCESSOR;
    }

    public double getWEIGHT_PROCESSOR() {
        return WEIGHT_PROCESSOR;
    }
}
