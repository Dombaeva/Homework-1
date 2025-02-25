package homework7;

public class Sputnik extends ObjectInSpace {

    public Sputnik(String name, int mass, int radius) {
        super(name, mass, radius);
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return "Спутник: " + getName() + ", Масса: " + getMass() + " кг, радиус " + getRadius() + " м";
    }
}
