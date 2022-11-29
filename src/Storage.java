public class Storage {
    private final StorageType storageType;
    private final double memorySize;
    private final double weight;

    Storage(StorageType storageType, double memorySize, double weight) {
        this.storageType = storageType;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageType=" + storageType +
                ", memorySize=" + memorySize +
                ", weight=" + weight +
                '}';
    }
}
