package behavioral.strategy.goodcase;

import behavioral.templatemethod.PowerUnitType;

public class PowerUnit {

    private PowerUnitType powerType;
    private PowerConditionChecker conditionChecker; // 외부 클래스인 PowerUnitConditionChecker 도입
    private static final String ENGINE_ON = "ON";
    private static final String ENGINE_OFF = "OFF";
    private String engineStatus = ENGINE_OFF;

    public PowerUnit(PowerUnitType powerType, PowerConditionChecker conditionChecker) {
        this.powerType = powerType;
        this.conditionChecker = conditionChecker; // 외부로부터 PowerUnitConditionChecker를 주입 받음
    }

    public void startEngine(PowerUnitType powerType) {
        if (conditionChecker.checkConditionForStart(powerType)) {
            engineStatus = ENGINE_ON;
        }
    }
}