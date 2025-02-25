
public class Vikarn extends Kaurav {

    int kindnessLevel;

    public Vikarn(String name, int obedienceLevel, int kindnessLevel) {
        super(name, obedienceLevel);
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public void fight() {
        System.out.println(name + " fights valiantly and nobly.");
    }

    @Override
    public void disobey() {
        System.out.println(name + " is a noble Kaurav who obeys his conscience.");
    }

    public void kind() {
        System.out.println(name + " is kind and shows noble behavior.");
    }
}
