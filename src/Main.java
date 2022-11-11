import categore.Categore;
import categore.CategoreB;
import categore.CategoreD;
import categore.CateroreC;
import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Truck maz = new Truck("маз", "d-985", 3.0, Weight.N1);
        Truck kraz = new Truck("краз", "d-985", 3.6, Weight.N2);
        Truck man = new Truck("ман", "d-985", 3.2, Weight.N2);
        Truck vaz = new Truck("ваз", "d-985", 4.0, Weight.N3);

        Car lada = new Car("лада", "3125", 1.6, TypeOfBody.COUPE);
        Car muzda = new Car("mazda", "3-87", 2.0, TypeOfBody.HACHBEKk);
        Car bmw = new Car("bmw", "x-5", 3.1, TypeOfBody.CROSSOVER);
        Car moskvich = new Car("москвич", "425", 1.8, TypeOfBody.MINIVAN);

        Bus bus = new Bus("bus", "желтый", 2.6, Capacity.LARGE);
        Bus mers = new Bus("mers", "черный", 3.0, Capacity.SMALL);
        Bus volhganin = new Bus("волжанин", "белый", 3.8, Capacity.MEDIUM);
        Bus ekarus = new Bus("экарус", "красны ", 3.5, Capacity.EXTRA_LARGE);

        maz.infoAvto();
        maz.startDrive();
        maz.stopDrive();

        lada.infoAvto();
        lada.startDrive();
        lada.stopDrive();

        bus.infoAvto();
        bus.startDrive();
        bus.stopDrive();

        service(
                lada, muzda, bmw, moskvich,
                maz, kraz, man, vaz,
                bus, mers, volhganin, ekarus,
                );

        Driver<CategoreB> driverB = new Driver("Ола", true, 3, new Categore());
        Driver<CategoreC> driverC = new Driver("Коля", true, 10, new Categore());
        Driver<CategoreD> driverD = new Driver("Толя", true, 15, new Categore());

        driverB.start();
        driverC.stop();
        driverD.refuel();

        lada.pitStop();
        maz.bestTimeTrack();
        ekarus.maxSpeed();
    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
        }
    }
    public static void serviceTransport(Transport transport){
    try {
        if (!transport.service()) {
            throw new RuntimeException("Автомобиль" + transport.getBrend() + " " + transport.getModel() + " не прошел диагностику")
        }
    }catch (RuntimeException e) {
        System.out.println();
    }
}
    private static void printInfo(Driver<?> driver, Transport transport){
        System.out.println("Водитель" + driver.getName() + " " + transport.getModel() +
                "будет участвовать в заезде");
    transport.printType();
    }
}






