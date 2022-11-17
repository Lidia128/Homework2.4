package driver;

import categore.Categore;
import driver.Driver;
public class DriverD extends Driver {
    public DriverD(String name, boolean hasDriveverLicense, int experience, Categore categore) {
        super(name, hasDriveverLicense, experience, categore);}
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


