
public class App {

  public static void main(String[] args) {
    Captain captain = new Captain(new BattleFishingBoat());
    captain.move(new DistanceKM(500));
    captain.fire();
  }
}

Pattern : Decorator
- Captain implements BattleShip et attribut BattleShip

Pattern : Strategy
- DistanceKM implements Distance
- DistanceMiles implements Distance

Pattern : Adapter
- BattleFishingBoat implements BattleShip et attribut FishingBoat
