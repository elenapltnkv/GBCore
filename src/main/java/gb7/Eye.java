package gb7;

public class Eye {
    public Eye() {

    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Eye{" +
                "eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public Eye(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    private String eyeColor;
}
