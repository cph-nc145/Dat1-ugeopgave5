package Task2;

public class Building {
    final private int rooms = 0;
    private int numberOfBathrooms = 0;
    private int numberOfFloors = 0;
    private boolean isOfficeBuilding = false;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
