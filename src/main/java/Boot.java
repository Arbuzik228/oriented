//polymorphism

import java.util.Arrays;

/**
 * Created by Admin on 23.10.2019.
 */
public class Boot {
    public static void main(String[] args) {
        //extends
        //example class
        Dog g = new Dog();
        g.voice();
        Doberman h = new Doberman();
        h.voice();
        //Polymorphism
        Cow white= new Cow();
        white.printColor();
        white.printCow();
        Cow blue=new Whale();
        blue.printCow();
        blue.printColor();
        blue.printAll();
        Object lemon= new Whale();
        //downcast
        if(lemon instanceof Whale){
            Whale whale=(Whale)lemon;
        }
        Cow cow = new Cow();
        User a = new User("login", "password");
        a.printUser();
        User b = new User("Certificate", "Certificate12))");
        b.printUser();
        User c = new User();
        c.login = "";
        c.printUser();
        User d = new User.Admin("login", "password");
        User v = new User.Moderator("login", "password");
        d.printUser();
        test(a);
        test(d);
       double dd = User.pi;
        User n[];
        n = new User[4];
        n[0] = a;
        n[1] = b;
        n[2] = c;
        n[3] = d;
        System.out.println(Arrays.toString(n));
        User use = new User("use", "password") {
            @Override
            public void printUser() {
                System.out.println("Raaar!");
            }
        };
        use.printUser();
    }


    public static void test(User u) {
    }

}
