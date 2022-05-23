public class Ram {

    String name;
    int value;

    public Ram() {
    }

    public Ram(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String printRam (){
        String print = "name: " + name + ", value: " + value;
        return print;
    }
}
