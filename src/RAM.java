public class RAM {

    private final String ramType;
    private final int memorySize;
    private final double ramWeight;

    RAM(String ramType, int memorySize, double ramWeight) {
        this.ramType = ramType;
        this.memorySize = memorySize;
        this.ramWeight = ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramType='" + ramType + '\'' +
                ", memorySize=" + memorySize +
                ", ramWeight=" + ramWeight +
                '}';
    }
}
