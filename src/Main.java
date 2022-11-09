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

        DriverB <categoreB>olya = new DriverB("Оля", "B", 3);
        DriverC<categoreC> kolya = new DriverC("Коля", "C", 10);
        DriverD<categoryD> tolya = new DriverD("Толя", "D", 15);
        olya.start();
        kolya.stop();
        tolya.refuel();

        lada.pitStop();
        maz.bestTimeTrack();
        ekarus.maxSpeed();

    }
    private static void printInfo(Driver<?> driver, Transport transport){
        System.out.println("Водитель" + driver.getName() + " " + transport.getModel() +
                "будет участвовать в заезде");
    transport.printType();
    }
}






