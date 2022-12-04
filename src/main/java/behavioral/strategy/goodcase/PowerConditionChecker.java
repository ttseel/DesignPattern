package behavioral.strategy.goodcase;

import behavioral.templatemethod.PowerUnitType;

public interface PowerConditionChecker {

    boolean checkConditionForStart(PowerUnitType powerType);
}
