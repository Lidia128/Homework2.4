public abstract class Driver<T extends Transport> {
    private String name;
    private String categore;
    int experience;
    private T car;

    public Driver(String name, String categore, int experience) {
        this.name = name;
        this.categore = categore;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCategore() {
        return categore;

    }
    public void start () {
        System.out.println("Начать движение");}
    public void stop ( ) {
        System.out.println("Закончить движение");
    }
    public void refuel (){
        System.out.println("Заправить авто");
    }
    public void driverAvto (Transport transport) {
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s%s и будет участвовать в заезде",
                this.name, this.car.getBrend(),this.car.getModel());
    }
}