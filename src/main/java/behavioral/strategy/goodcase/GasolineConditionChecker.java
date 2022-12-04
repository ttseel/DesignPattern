package behavioral.strategy.goodcase;

import behavioral.templatemethod.PowerUnitType;

public class GasolineConditionChecker implements PowerConditionChecker {

    @Override
    public boolean checkConditionForStart(PowerUnitType powerType) {
        boolean result = false;
        if (powerType == PowerUnitType.GASOLINE) {
            System.out.println("Check condition for stating GASOLINE Engine");
            // ..
            result = true;
        }
        return result;
    }
}
