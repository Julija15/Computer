public class Hdd {

    String name;
    int value;
    String type;

    public Hdd() {
    }

    public Hdd(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }
    public String printHdd (){
        String print = "name: " + name + ", value: " + value + ", type: " + type;
        return print;
    }
}
