

public class GeometricObject {
    public String color;
    public boolean filled;
    public GeometricObject() {}
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    String color() {
        return this.color;
    }

    boolean filled() {
        return this.filled;
    }
}
