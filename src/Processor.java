public class Processor {
    private final int frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    Processor(int frequency, int numberOfCores, String manufacturer, double weight){
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                '}';
    }
}


