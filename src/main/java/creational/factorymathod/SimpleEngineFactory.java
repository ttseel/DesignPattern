package creational.factorymathod;

public class SimpleEngineFactory {

    public enum TYPE {
        GASOLINE, ELECTRIC
    }

    public Engine createEngine(TYPE type) {
        Engine engine = null;
        switch (type) {
            case GASOLINE:
                engine = new GasolineEngine();
                break;
            case ELECTRIC:
                engine = new ElectricMotor();
                break;
            default:
                break;
        }
        return engine;
    }
}
