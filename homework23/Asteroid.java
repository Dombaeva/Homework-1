package homework23;

public class Asteroid extends ObjectInSpace {
    private int absoluteValue;
    private double albedoP;

    public Asteroid(String name, int mass, int radius, int absoluteValue, double albedoP) {
        super(name, mass, radius);
        this.absoluteValue = absoluteValue;
        this.albedoP = albedoP;
    }

    @Override
    public double getDiameter() {
        return Math.pow(10, (absoluteValue - 2.5 * Math.log10(albedoP))) * 100;
    }

    @Override
    public String toString() {
        return "Астероид: " + getName() + ", Масса: " + getMass() + " кг, Радиус " + getRadius() +
                " м, Абсалютна величина: " + absoluteValue + ", Альбедо: " + albedoP;
    }
}
