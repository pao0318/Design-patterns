package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboticObject = new HashMap<>();
    public static IRobot createRobot(String robotType){
        if(roboticObject.containsKey(robotType))
            return roboticObject.get(robotType);
        else {
            IRobot newRobot = null;
            Sprites sprites = new Sprites();  // Shared intrinsic state
            if(robotType == "HUMANOID")
                newRobot =  new HumanoidRobot(robotType,sprites);
            else if (robotType =="ROBOTICDOG")
                newRobot =   new HumanoidRobot(robotType,sprites);
            roboticObject.put(robotType,newRobot);
            return newRobot;
        }

    }
}
