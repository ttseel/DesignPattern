package behavioral.templatemethod.goodcase;

import behavioral.templatemethod.PowerUnitType;

public class DieselEngine extends PowerUnit {

    private PowerUnitType powerType = PowerUnitType.DIESEL;

    @Override
    public boolean checkConditionForStart(PowerUnitType powerType) {
        boolean result = false;
        if (powerType == PowerUnitType.GASOLINE) {
            System.out.println("Check condition for stating GASOLINE Engine");
            // 디젤 엔진 시동 조건 체크
            result = true;
        }
        return result;
    }
}
