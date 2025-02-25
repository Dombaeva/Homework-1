package homework7;

public class Comet extends ObjectInSpace {
    private double tailLength;

    public Comet(String name, int mass, int radius, double tailLength) {
        super(name, mass, radius);
        this.tailLength = tailLength;
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return "Комета: " + getName() + ", Масса: " + getMass() + " кг, Радиус: " + getRadius() + " м, Длина хвоста: " + tailLength + " км";
    }
}
