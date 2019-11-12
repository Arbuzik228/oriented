

/**
 * Created by Admin on 30.10.2019.
 */
public class Boot1  {
    public static void main(String[]args) {
        User add= new User("login","password");
        System.out.println(add.pi);
        User app=new User("","");
        System.out.println(app.pi);
    }
}
