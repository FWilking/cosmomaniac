package FelixWilking;

public class Main {

    public static void main(String[] args) {
        int staramount = 10;
        int boardwidth = 20;
        int starsize = 100;

        Star[] stars = new Star[staramount];
        for(Star s : stars) {
            s = new Star((int) (Math.random() * boardwidth), (int) (Math.random() * boardwidth), (int) (Math.random() * boardwidth), (int) (Math.random() * starsize), new Planet[starsize]);
            for(Planet p : s.planets){
                p = new Planet((int) ((Math.random() - 0.5) * s.getSize()))
            }
        }
        System.out.print(newplanet.name);
    }
}
