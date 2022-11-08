public abstract  class Transport {

    private String brend;
    private String model;
    private double volume;

    public Transport(String brend, String model, double volume) {
        this.brend = brend;
        this.model = model;
        this.volume = volume;

    }

    public void startDrive() {
        System.out.println("Начать движение.");
    }
    public void stopDrive () {
        System.out.println("Закончить движение");
    }
    public void infoAvto (){
        System.out.println("Траснспортное средство " + getBrend () + " модель " + getModel() + " с объемом " +
                "двигателя " + getVolume());
    }
    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }


















































































































    public double getVolume() {
        return volume;
    }
}
