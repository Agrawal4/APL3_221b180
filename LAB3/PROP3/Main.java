public class Main {
    public static void main(String[] args) {
        
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        
       
        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();
        System.out.println();

        System.out.println("Wooden Duck:");
        woodenDuck.swim();
        woodenDuck.mute();
        System.out.println();

        System.out.println("RedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        System.out.println();

        System.out.println("Lake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
