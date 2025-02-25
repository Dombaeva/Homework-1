package homework7;

public final class SpaceUtils {

    public static double forseOfGravity(Moon moon, Planets planets) {
        final double G = 6.67430e-11; // Гравитационная постоянная
        double distance = planets.getDistanceFromMoon();
        return G * (moon.getMass() * planets.getMass()) / (distance * distance);
    }

    public static boolean isStar(Star star) {
        return star instanceof Star;
    }

}
