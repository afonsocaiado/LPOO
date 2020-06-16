import java.util.ArrayList;
import java.util.List;

public class Room extends Facility{

    private Building building;
    private String number;
    private int floor, capacity;
    private List<User> roomUsers;

    public Room(Building building, String number, int floor) throws IllegalArgumentException, DuplicateRoomException{

        if(floor > building.getMaxFloor() || floor < building.getMinFloor())
            throw new IllegalArgumentException();

        for(Room room : building.getRooms()){
            if(room.getNumber().equals(number))
                throw new DuplicateRoomException();
        }
        building.addRoom(this);

        this.building = building;
        this.number = number;
        this.floor = floor;
        this.capacity = 0;
        this.roomUsers = new ArrayList<>();
    }

    public Room(Building building, String number, int floor, int capacity) throws IllegalArgumentException, DuplicateRoomException{

        if(floor > building.getMaxFloor() || floor < building.getMinFloor())
            throw new IllegalArgumentException();

        building.setCapacity(building.getCapacity() + capacity);

        building.addRoom(this);

        this.building = building;
        this.number = number;
        this.floor = floor;
        this.capacity = capacity;
        this.roomUsers = new ArrayList<>();
    }

    public Building getBuilding() {
        return building;
    }

    public String getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public String getName(){
        return building.getName() + number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void authorize(User user) {
        roomUsers.add(user);
    }

    @Override
    public boolean canEnter(User user) {
        for(User u : roomUsers){
            if(u.equals(user)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room(" +
                building.getName() +
                "," + number + ")";
    }
}
