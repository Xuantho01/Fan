public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){}
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String defaults(){
        return "Speed: "+ SLOW+ "\n"+"Status: off"+ "\nColor is: Blue";
     }
    public String toString(){
        if (isOn()){
            return "Speed: "+ getSpeed() + "\n"+"Status: "+ isOn()+ "\nColor is: " +getColor() + "\nRadius: "+ getRadius()+"\nFan is on";
        }
        else{
            return "Speed: "+ getSpeed() + "\n"+"Status: "+ isOn()+ "\nColor is: " +getColor() + "\nRadius: "+ getRadius()+"\nFan is off";
        }
    }
}
