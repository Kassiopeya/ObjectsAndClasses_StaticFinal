public class Keyboard {
    private final String keyboardType;
    private final boolean isKeyIllumination;
    private final double keyboardWeight;

    public Keyboard(String keyboardType, boolean isKeyIllumination, double keyboardWeight) {
        this.keyboardType = keyboardType;
        this.isKeyIllumination = isKeyIllumination;
        this.keyboardWeight = keyboardWeight;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public boolean isKeyIllumination() {
        return isKeyIllumination;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType='" + keyboardType + '\'' +
                ", isKeyIllumination=" + isKeyIllumination +
                ", keyboardWeight=" + keyboardWeight +
                '}';
    }
}
