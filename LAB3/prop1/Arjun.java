
public class Arjun extends Pandav {

    public Arjun(String name, int obedienceLevel, int kindnessLevel) {
        super(name, obedienceLevel, kindnessLevel);
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting skillfully.");
    }

    @Override
    public void obey() {
        System.out.println(name + " obeys with full discipline.");
    }

    @Override
    public void kind() {
        System.out.println(name + " shows great kindness.");
    }
}
