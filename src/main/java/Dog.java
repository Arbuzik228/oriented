/**
 * Created by Admin on 07.11.2019.
 */
public class Dog {
    public void voice(){
        System.out.println("This is dog class");
    }

}
class Doberman extends Dog {
    @Override
    public void voice (){
        super.voice();
        System.out.println("This is Doberman class");
    }
}