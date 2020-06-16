import java.util.ArrayList;
import java.util.List;

public class Building extends Facility{

    private String name;
    private int minFloor;
    private int maxFloor;
    private int capacity;
    private List<Room> rooms;
    private List<User> buildingUsers;

    public Building(String name, int minFloor, int maxFloor) throws IllegalArgumentException{

        if(minFloor > maxFloor)
            throw new IllegalArgumentException();

        this.name = name;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.capacity = 0;
        this.rooms = new ArrayList<>();
        this.buildingUsers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    @Override
    public boolean canEnter(User user) {
        for(Room room : rooms){
            if(room.canEnter(user))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Building(" +
                name + ")";
    }
}
