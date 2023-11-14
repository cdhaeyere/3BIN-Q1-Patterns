import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private Map<String, AbstractFactory> map = new HashMap<>();

    public void ajouterFlyweight(String s, AbstractFactory factory){
        map.put(s,factory);
    }

    public Robot creerRobot(String robot){
        AbstractFactory abstractFactory = map.get(robot);
        return abstractFactory.createRobot();
    }
}