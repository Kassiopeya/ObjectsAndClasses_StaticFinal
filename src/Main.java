public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Vendor1", "computer1");
        Computer computer2 = new Computer("Vendor2", "computer2");

        Processor processor1 = new Processor(3600, 4, "INTEL", 0.2);
        Processor processor2 = new Processor(3600, 4, "AMD", 0.2);

        RAM ram1 = new RAM("anyRAMtype", 8, 20.0);
        RAM ram2 = new RAM("anyRAMtype", 16, 20.0);

        Storage storage1 = new Storage(StorageType.HDD, 3, 300);
        Storage storage2 = new Storage(StorageType.HDD, 2, 200);

        Display display1 = new Display(18.5, DisplayType.IPS, 2);
        Display display2 = new Display(18.5, DisplayType.TN, 2);

        Keyboard keyboard1 = new Keyboard("Mechanical", true, 200);
        Keyboard keyboard2 = new Keyboard("Membrane", false, 100);

        computer1.setRam(ram1);
        computer1.setProcessor(processor1);
        computer1.setStorage(storage2);
        computer1.setKeyboard(keyboard2);
        computer1.setDisplay(display1);

        computer2.setRam(ram2);
        computer2.setProcessor(processor2);
        computer2.setStorage(storage1);
        computer2.setKeyboard(keyboard1);
        computer2.setDisplay(display2);

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}