package FelixWilking;

public class Star extends Spaceobject {
    public Planet[] planets;
    public String name;
    private static int z;
    private static int y;
    private static int x;
    private static int size;

    public Star(int x, int y, int z, int size, Planet[] planets) {
        super(x, y, z, size);
        this.planets = planets;
        this.name = generatename();
    }

    public static int getSize() {
        return size;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }
}
