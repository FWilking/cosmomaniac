package FelixWilking;

public class Star extends Spaceobject {
    private final Planet[] planets;
    public String name;

    public Star(int x, int y, int z, int size, Planet[] planets) {
        super(x, y, z, size);
        this.planets = planets;
    }
}
