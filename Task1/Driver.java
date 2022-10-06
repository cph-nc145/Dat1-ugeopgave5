package Task1;

public class Driver {
    private String name = "";
    private int age = 0;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Is driven by '" + name + '\'' +
                '}';
    }
}
