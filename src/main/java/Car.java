/**
 * Constructor
 * Created by Admin on 04.11.2019.
 */
public class Car {
    String model;
    int minSpeed;
    int maxSpeed;

    //?????????????
    {
        model = "Default model";
        minSpeed = -1;
        maxSpeed = -1;
    }

    public Car(String model, int minSpeed, int maxSpeed) {
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.model = model;

    }

    public Car(String model) {
        this.model = model;

    }

    //private Constructor
    private Car() {
        //  throw new AssertionError();
    }

    public Car(Car object) {
        this.model = object.model;
        this.minSpeed = object.minSpeed;
        this.maxSpeed = object.maxSpeed;
    }

    public Car(int minSpeed, int maxSpeed) {
        this("Cayen", minSpeed, maxSpeed);
//        this();
    }


    public static void main(String[] args) {
        Car porsche = new Car("Cayen", 200, 500);
        Car mersedes = new Car("Mersedes");
        Car a = new Car();
        Car opel = new Car(mersedes);
        Car mazda = new Car(200, 500);
        System.out.println("Mazda: " + mazda.model + "\n " + mazda.minSpeed + "\n " + mazda.maxSpeed);
        System.out.println(opel.model + " " + mersedes.model);
        System.out.println(mersedes.model + " " + a.model);
        System.out.println("Mercedes speed = " + mersedes.maxSpeed + " " + mersedes.model + " " + a.model);
        System.out.println(porsche.model + " \n" + porsche.minSpeed + " \n" + porsche.maxSpeed);
    }
}
