public class Main {
    public static void main(String[] args) {
        Truck maz = new Truck("маз", "d-985", 3.0);
        Truck kraz = new Truck("краз", "d-985", 3.6);
        Truck man = new Truck("ман", "d-985", 3.2);
        Truck vaz = new Truck("ваз", "d-985", 4.0);

        Car lada = new Car("лада", "3125", 1.6);
        Car muzda = new Car("mazda", "3-87", 2.0);
        Car bmw = new Car("bmw", "x-5", 3.1);
        Car moskvich = new Car("москвич", "425", 1.8);

        Bus bus = new Bus ("bus", "желтый", 2.6);
        Bus mers = new Bus ("mers", "черный", 3.0);
        Bus volhganin = new Bus ("волжанин", "белый", 3.8);
        Bus ekarus = new Bus ("экарус", "красны ", 3.5);

        maz.infoAvto();
        maz.startDrive();
        maz.stopDrive();

        lada.infoAvto();
        lada.startDrive();
        lada.stopDrive();

        bus.infoAvto();
        bus.startDrive();
        bus.stopDrive();

        DriverB olya = new DriverB("Оля", "B", 3);
        DriverC kolya = new DriverC("Коля", "C", 10);
        DriverD tolya = new DriverD("Толя", "D", 15);
        olya.start();
        kolya.stop();
        tolya.refuel();


        }

        }
