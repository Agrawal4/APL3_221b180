
public class Duryodhan extends Kaurav {

    public Duryodhan(String name, int obedienceLevel) {
        super(name, obedienceLevel);
    }

    @Override
    public void fight() {
        System.out.println(name + " fights bravely, but with cruelty.");
    }

    @Override
    public void disobey() {
        System.out.println(name + " is notorious for disobeying.");
    }
}
