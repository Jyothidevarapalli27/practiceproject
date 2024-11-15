public class Robot {

    int battery = 100;      // battery level percentage (0 to 100)
    int speed = 0;         //current speed of the robot
    String name = "Robot";   //Name of the robot
    String robotName = "Sofi";
    String colour = "silver";
    int weight = 250;


    public void move() {
        speed = 5;
        System.out.println(name +   " is moving at speed: " + speed    +           "mph");
    }

    public void stop() {
        speed = 0;
        System.out.println(name +  " has Stopped.");
    }
    public void chargeBattery() {
        battery = 100;
        System.out.println(name +  "'s battery fully charged.");
    }
    public void checkBatteryLevel(){
        System.out.println(name +  "'s current battery level is: " +  battery   +                          "%");

    }
    public void displayInfo(){
        System.out.println("sharing: Personal robotInfo ");
        System.out.println("Robot name is : " + robotName );
        System.out.println("Robot colour is: " + colour);
        System.out.println("Robot weight is : " + weight +  "lbs");
    }


}
