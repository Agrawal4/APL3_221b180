
public class Bheem extends Pandav {

    public Bheem(String name, int obedienceLevel, int kindnessLevel) {
        super(name, obedienceLevel, kindnessLevel);
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting with great strength.");
    }

    @Override
    public void obey() {
        System.out.println(name + " obeys with great discipline.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind, though not as much as Arjun.");
    }
}
