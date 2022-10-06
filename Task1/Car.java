package Task1;

public class Car {
    private String make = "";
    private String model = "";
    private String bodyStyle = "";
    private int year = 0;
    private String driver = "";

    public Car(String make, String model, String bodyStyle, int year) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.year = year;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


    public void fuck(){
        System.out.println("fuck");
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + make + '\'' +
                ", Model='" + model + '\'' +
                ", BodyStyle='" + bodyStyle + '\'' +
                ", year=" + year +
                '}';
    }
}
