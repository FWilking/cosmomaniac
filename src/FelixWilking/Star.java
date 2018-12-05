package FelixWilking;

public class Star extends Spaceobject {
    private final Planet[] planets;
    public String name;

    public Star(int size, Planet[] planets) {
        super(size);
        this.planets = planets;
    }
}
