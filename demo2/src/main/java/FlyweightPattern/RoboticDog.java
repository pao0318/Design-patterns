package FlyweightPattern;

public class RoboticDog implements IRobot {
    private final String type;
    private final Sprites body;  // Intrinsic state

    RoboticDog(String type, Sprites body){
        this.type = type;
        this.body = body;
    }
    public String getType() {
        return type;
    }
    public Sprites getBody() {
        return body;
    }
    @Override
    public void display(int x, int y){
        System.out.println("Robotic Dog"+ x + " "+y);
    }
}
