package FelixWilking;

public class Planet extends Spaceobject {
    private static int z;
    private static int y;
    private static int x;
    private final Star star;
    public String name;

    public Planet(int size, Star star) {
        super(x, y, z, size);
        this.star = star;
        this.name = generatename();
    }
}
