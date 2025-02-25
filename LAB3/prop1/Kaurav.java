
public abstract class Kaurav extends Bharatvanshi {
    int obedienceLevel;

    public Kaurav(String name, int obedienceLevel) {
        super(name);
        this.obedienceLevel = obedienceLevel;
    }

    public void disobey() {
        System.out.println(name + " disobeys orders.");
    }
}
