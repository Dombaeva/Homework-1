package homework7;

public abstract class ObjectInSpace {

    private String name;
    private int mass;
    private int radius;

    public ObjectInSpace(String name, int mass, int radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public abstract double getDiameter();

    public boolean compareMass(ObjectInSpace other) {
        return this.mass > other.getMass();
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getRadius() {
        return radius;
    }


}
