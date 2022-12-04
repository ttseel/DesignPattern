package behavioral.strategy.goodcase;

import behavioral.templatemethod.PowerUnitType;

public class ElectricConditionChecker implements PowerConditionChecker {

    @Override
    public boolean checkConditionForStart(PowerUnitType powerType) {
        boolean result = false;
        if (powerType == PowerUnitType.ELECTRIC) {
            System.out.println("Check condition for stating ELECTRIC Motor");
            // ..
            result = true;
        }
        return result;
    }
}
