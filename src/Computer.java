public class Computer {

    String model;
    int cost;
    Ram ram;
    Hdd hdd;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
        ram = new Ram();
        hdd = new Hdd();
    }

    public Computer(String model, int cost, Ram ram, Hdd hdd) {
        this.model = model;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printComputer (){
        System.out.println("Computer: " + model + ", cost: " + cost + ", RAM: " + ram.printRam() + " , HDD: " + hdd.printHdd());
    }
}
