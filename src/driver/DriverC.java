package driver;

import driver.Driver;

public class DriverC extends Driver {

    public DriverC(String name, String categore, int experience) {
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
