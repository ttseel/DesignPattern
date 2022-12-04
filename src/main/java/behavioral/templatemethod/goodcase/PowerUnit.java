package behavioral.templatemethod.goodcase;

import behavioral.templatemethod.PowerUnitType;

public abstract class PowerUnit {

    protected PowerUnitType powerType;
    private static final String ENGINE_ON = "ON";
    private static final String ENGINE_OFF = "OFF";
    private String engineStatus = ENGINE_OFF;

    public void startEngine(PowerUnitType powerType) {
        if (checkConditionForStart(powerType)) {
            engineStatus = ENGINE_ON;
        }
    }

    public abstract boolean checkConditionForStart(PowerUnitType powerType);
}