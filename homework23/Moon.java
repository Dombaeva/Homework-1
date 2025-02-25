package homework23;

public class Moon extends ObjectInSpace implements isHabitable {
    private boolean hasWater;

    public Moon(String name, int mass, int radius, boolean hasWater) {
        super(name, mass, radius);
        this.hasWater = hasWater;
    }

    public Moon(String name, int mass, int radius) {
        super(name, mass, radius);

    }

    @Override
    public boolean checkHabitability() {
        return hasWater;
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return "Луна: " + getName() + ", Масса: " + getMass() + " кг, Наличие воды: " + (hasWater ? "Да" : "Нет");
    }
}
