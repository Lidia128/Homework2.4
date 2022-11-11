package driver;

import driver.Driver;

public class DriverB extends Driver {

    public DriverB(String name, String categore, int experience) {
        super(name, categore, experience);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void refuel() {
        super.refuel();
    }
}
