package FlyweightPattern;

public class Main {
    public static void main(String args[]){
        IRobot humanoid1 = RoboticFactory.createRobot("HUMANOID");
        humanoid1.display(10, 20);

        // Create or retrieve another humanoid robot (should reuse the existing one)
        IRobot humanoid2 = RoboticFactory.createRobot("HUMANOID");
        humanoid2.display(30, 40);

        // Create or retrieve a robotic dog
        IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboticDog1.display(50, 60);

        // Verify that both humanoid robots are the same instance (Flyweight pattern)
        System.out.println("Are humanoid1 and humanoid2 the same instance? " + (humanoid1 == humanoid2));

        // Verify that humanoid and robotic dog are different instances
        System.out.println("Are humanoid1 and roboticDog1 different instances? " + (humanoid1 != roboticDog1));
    }
}
