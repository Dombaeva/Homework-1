package homework23;

public class Star extends ObjectInSpace {
    private double luminosity;
    private double temperature;
    final double sigma = 5.67e-8; // Постоянная Стефана-Больцмана
    public Star(String name, int mass, int radius) {
        super(name, mass, radius);
    }

    @Override
    public double getDiameter() {
        return 2 * Math.sqrt(luminosity / (4 * Math.PI * sigma * Math.pow(temperature, 4)));
    }

    @Override
    public String toString() {
        return String.format("Звезда:" + getName() + ", Масса: " + getMass() + " кг, Радиус: " + getRadius()+ " м, Светимость: "  + luminosity + " Вт, Температура: " +
                temperature + " К.");
    }
}
