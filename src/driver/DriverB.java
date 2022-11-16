package driver;

import categore.Categore;
import driver.Driver;

public class DriverB extends Driver {

    public DriverB(String name, boolean hasDriveverLicense, int experience, Categore categore) {
        super(name, hasDriveverLicense, experience, categore);
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
