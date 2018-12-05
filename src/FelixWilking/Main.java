package FelixWilking;

public class Main {

    public static void main(String[] args) {
        int staramount = 10;
        int boardwidth = 20;
        int starsize = 100;

        Planet[] planets = new Planet[1];
        Star newstar = new Star(1, planets);
        Star[] stars = new Star[staramount];
        Planet newplanet = new Planet(1, newstar);
        planets[0] = newplanet;
        for(int i = 0; i < staramount; i++){
            stars[i] = new Star((int) (Math.random() * starsize), (int) ());
        }
        System.out.print(newplanet.name);
    }
}
