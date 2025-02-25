package homework23;

public final class SpaceUtils {
    private SpaceUtils() {

    }

    public static double forseOfGravity(Moon moon, Planets planets) {
        final double G = 6.67430e-11; // Гравитационная постоянная
        double distance = planets.getDistanceFromSun();
        return G * (moon.getMass() * planets.getMass()) / (distance * distance);
    }

    public static boolean isStar(Star star){
        return star instanceof Star;
    }

}
