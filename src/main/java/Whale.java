//polymorphism

/**
 * Created by Admin on 07.11.2019.
 */
public class Whale extends Cow {
    @Override
    public void printCow() {
        System.out.println("I'm cool Whale!");
    }
    @Override
    public void printColor(){
        System.out.println("I'm blue");
    }
}
