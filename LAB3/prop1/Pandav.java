
public abstract class Pandav extends Bharatvanshi {
    int obedienceLevel;
    int kindnessLevel;

    public Pandav(String name, int obedienceLevel, int kindnessLevel) {
        super(name);
        this.obedienceLevel = obedienceLevel;
        this.kindnessLevel = kindnessLevel;
    }

    public void obey() {
        System.out.println(name + " obeys orders.");
    }

    public void kind() {
        System.out.println(name + " is kind.");
    }
}
