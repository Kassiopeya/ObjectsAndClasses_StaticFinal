public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;
    public double totalWeight;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public RAM getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Storage getStorage() {
        return storage;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
        totalWeight = totalWeight + processor.getWeight();
    }

    public void setRam(RAM ram) {
        this.ram = ram;
        totalWeight = totalWeight + ram.getRamWeight();
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
        totalWeight = totalWeight + storage.getWeight();
    }

    public void setDisplay(Display display) {
        this.display = display;
        totalWeight = totalWeight + display.getWeight();
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        totalWeight = totalWeight + keyboard.getKeyboardWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", storage=" + storage +
                ", display=" + display +
                ", keyboard=" + keyboard +
                ", totalWeight=" + totalWeight +
                '}';
    }
}

