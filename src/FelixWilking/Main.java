package FelixWilking;

public class Main {

    public static void main(String[] args) {
        Planet[] planets = new Planet[1];
        Star newstar = new Star(1, 1, 1, 10, planets);
        Planet newplanet = new Planet(1, 1, 1, 1, newstar);
        planets[1] = newplanet;
        System.out.print(newplanet.generatename());
    }
}
