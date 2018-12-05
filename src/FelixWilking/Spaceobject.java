package FelixWilking;

public abstract class Spaceobject {
    private final int size;
    private String name;

    public Spaceobject(int size) {
        System.out.println(generatename());
        this.name = generatename();
        this.size = size;
    }

    public static String generatename(){
        String vowels = "aeiou";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int namelength = 1 + (int)(Math.random()*3);
        String name = "";
        for(int i = 0; i < namelength; i++){
            name += letters.charAt((int) (Math.random()*letters.length()));
            name += vowels.charAt((int) (Math.random()*vowels.length()));
        }
        name += letters.charAt((int) (Math.random()*letters.length()));
        return name;
    }
}
