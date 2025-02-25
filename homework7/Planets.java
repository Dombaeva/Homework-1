package homework7;

public class Planets extends ObjectInSpace implements isHabitable, getDistanceFromMoon {
    private boolean hasWater;
    private boolean hasAtmosphere;
    private double distanceFromMoon;

    public Planets(String name, int mass, int radius, boolean hasWater, boolean hasAtmosphere, double distanceFromMoon) {
        super(name, mass, radius);
        this.hasWater = hasWater;
        this.hasAtmosphere = hasAtmosphere;
        this.distanceFromMoon = distanceFromMoon;
    }

    public Planets(String name, int mass, int radius) {
        super(name, mass, radius);

    }

    @Override
    public double getDiameter() {
        return getRadius() * 2;
    }

    @Override
    public boolean checkHabitability() {
        return hasAtmosphere && hasWater;
    }

    @Override
    public double getDistanceFromSun() {
        return distanceFromMoon;
    }

    @Override
    public String toString() {
        return "Планета: " + getName() + ", Масса: " + getMass() + " м, Дистанция до Луны " + distanceFromMoon + " км, Наличие воды: " + (hasWater ? "Да" : "Нет") + " Атмосфера: " + (hasAtmosphere ? "Да" : "Нет");
    }
}
