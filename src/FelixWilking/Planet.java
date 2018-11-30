package FelixWilking;

public class Planet extends Spaceobject {
    private final Star star;

    public Planet(int x, int y, int z, int size, Star star) {
        super(x, y, z, size);
        this.star = star;
    }
}
