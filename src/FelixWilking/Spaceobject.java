package FelixWilking;

public abstract class Spaceobject {
    private final int x;
    private final int y;
    private final int z;
    private final int size;
    private final String name;

    public Spaceobject(String name, int x, int y, int z, int size) {
        this.name = generatename();
        this.x = x;
        this.y = y;
        this.z = z;
        this.size = size;
    }

    public static String generatename(){
        String vowels = "aeiou";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int namelength = 1 + (int)(Math.random()*10);
        String name = "";
        for(int i = 0; i < namelength; i++){
            name += letters.charAt((int)(Math.random()*letters.length()));
            name += vowels.charAt((int)(Math.random()*letters.length()));
        }
        name += letters.charAt((int)(Math.random()*letters.length()));
        return name;
    }
}
