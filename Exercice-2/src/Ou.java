import java.util.ArrayList;
import java.util.List;

public class Ou implements Strategy {

    private List<Strategy> strategies;

    public Ou() {
        strategies = new ArrayList<>();
    }

    public void add(Strategy strategy) {
        strategies.add(strategy);
    }

    @Override
    public boolean imprimerSi(String c) {
        for (Strategy strategy : strategies) {
            if (strategy.imprimerSi(c)) {
                return true;
            }
        }
        return false;
    }
}
