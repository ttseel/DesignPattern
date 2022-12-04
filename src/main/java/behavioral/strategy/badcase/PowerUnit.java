package behavioral.strategy.badcase;

import behavioral.templatemethod.PowerUnitType;

public class PowerUnit {

    protected PowerUnitType powerType;
    private static final String ENGINE_ON = "ON";
    private static final String ENGINE_OFF = "OFF";
    private String engineStatus = ENGINE_OFF;

    public PowerUnit(PowerUnitType powerType) {
        this.powerType = powerType;
    }

    public void startEngine(PowerUnitType powerType) {
        if (checkConditionForStart(powerType)) {
            engineStatus = ENGINE_ON;
        }
    }

    public boolean checkConditionForStart(PowerUnitType powerType) {
        boolean result = false;
        if (powerType == PowerUnitType.GASOLINE) {
            System.out.println("Check condition for stating GASOLINE Engine");
            // 가솔린 엔진 시동 조건 체크
            result = true;
        } else if (powerType == PowerUnitType.DIESEL) {
            System.out.println("Check condition for stating DIESEL Engine");
            // 디젤 엔진 시동 조건 체크
            result = true;
        }
        return result;
    }
}
