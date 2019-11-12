

/**
 * Created by Admin on 23.10.2019.
 */
public class User {
    public String login;
    Password password;
    public static final double pi = 3.14;

    public User(String login, String password) {
        this.login = login;
        this.password = new Password(password);
    }

    public  void printUser() {
        System.out.println(login);
        password.printPassword();
    }

    public User() {
        this.login = "";
        this.password = new Password("");
    }

    public class Password {
        String password;

        Password(String p) {
            this.password = p;
        }

        public void printPassword() {
            System.out.println(password);
        }

    }

    public static class Admin extends User {
        public Admin(String login, String password) {
            super(login, password);
            System.out.println("Admin");
        }


    }

    public static class Moderator extends User {
        public Moderator(String login, String password) {
            super(login, password);
            System.out.println("Moderator");
        }


    }

    protected class UserProtected {

    }

}




