public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("asus",100);
        Computer computer2 = new Computer("hp",200,new Ram("intel",16),new Hdd("samsung",250,"vneshnij"));

        computer1.printComputer();
        computer2.printComputer();
    }
}