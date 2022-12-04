package behavioral.templatemethod.goodcase;

import behavioral.templatemethod.PowerUnitType;

public class ElectricMotor extends PowerUnit {

    private PowerUnitType powerType = PowerUnitType.ELECTRIC;

    @Override
    public boolean checkConditionForStart(PowerUnitType powerType) {
        boolean result = false;
        if (powerType == PowerUnitType.ELECTRIC) {
            System.out.println("Check condition for stating ELECTRIC Motor");
            // 전기차 모터 시동 조건 체크
            result = true;
        }
        return result;
    }
}
