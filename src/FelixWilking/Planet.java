package FelixWilking;

public class Planet extends Spaceobject {
    private final Star star;
    public String name;

    public Planet(int size, Star star) {
        super(size);
        this.star = star;
        this.name = generatename();
    }
}
