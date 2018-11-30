package FelixWilking;

public class Star extends Spaceobject {
    private final Planet[] planets;

    public Star(String name, int x, int y, int z, int size, Planet[] planets) {
        super(name, x, y, z, size);
        this.planets = planets;
    }
}
