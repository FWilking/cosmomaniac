package FelixWilking;

public class Planet extends Spaceobject {
    private final Star star;

    public Planet(String name, int x, int y, int z, int size, Star star) {
        super(name, x, y, z, size);
        this.star = star;
    }
}
