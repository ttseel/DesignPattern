package creational.factorymathod;

import creational.factorymathod.SimpleEngineFactory.TYPE;

public class Client {

    SimpleEngineFactory engineFactory;

    public Client(SimpleEngineFactory engineFactory) {
        this.engineFactory = engineFactory;
    }

    public void makeCar() {
        engineFactory.createEngine(TYPE.GASOLINE);
    }
}
