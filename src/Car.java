public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour

    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate1, double maxSpeed1, double speed1) {
        this.maxSpeed = maxSpeed1;
        this.speed = speed1;
        this.licensePlate = licensePlate1;

        if (speed1 > maxSpeed1) {
            maxSpeed = speed1;
        }
        else if(speed1 < 0) {
            speed = 0.0;
        }
    }

    public String print(){
        return "licenplate :"+ licensePlate+" \n"+"maxspeed :"+ maxSpeed+" \n"+"speed "+speed;
    }

    public static void main(String[] args) {
        Car car1 = new Car("biy- 555",70.0,40.0);
        System.out.println(car1.print());

        Car car2 =new Car("bfn-3343",50);
        System.out.println( car2.print());
    }

}
