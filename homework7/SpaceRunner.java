package homework7;

public class SpaceRunner {
    public static void main(String[] args) {
        ObjectInSpace planets = new Planets("Земля", 2373728, 232333, true, true, 433892824);
        ObjectInSpace asteroid = new Asteroid("Ирида", 4985858, 498984, 34, 0.2);
        ObjectInSpace moon = new Moon("Луна", 228888812, 3848, true);
        ObjectInSpace sputnik = new Sputnik("SpaceX", 500000, 71);
        ObjectInSpace star = new Star("Сириус", 87799, 4539, 12000, 1.4);
        ObjectInSpace comet = new Comet("Хьюмасона", 100000, 5000, 100000);

        System.out.println(planets);
        System.out.println(asteroid);
        System.out.println(moon);
        System.out.println(sputnik);
        System.out.println(star);
        System.out.println(comet);

        double gravitationalForce = SpaceUtils.forseOfGravity((Moon) moon, (Planets) planets);
        System.out.println("Гравитационная сила между " + moon.getName() + " и " + planets.getName() + " равна: " + gravitationalForce);
        System.out.println("Звезда " + SpaceUtils.isStar((Star) star));
    }
}
