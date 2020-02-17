public class testFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("red");
        fan1.setRadius(40);
        fan1.setOn(true);
        System.out.println("---------fan 1-------:");
        System.out.println(fan1.toString());
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("Blue");
        fan2.setRadius(50);
        fan2.setOn(false);
        System.out.println("---------fan 2-------:");
        System.out.println(fan2.toString());
    }
}
