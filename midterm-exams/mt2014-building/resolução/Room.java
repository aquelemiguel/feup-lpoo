import java.util.ArrayList;

public class Room implements Facility {

	Building building;
	String number, name;
	int floor, capacity;
	ArrayList<User> users = new ArrayList<User>();
	
	public Room(Building building, String number, int floor) throws DuplicateRoomException {
		if (floor < building.minFloor || floor > building.maxFloor){
			throw new IllegalArgumentException();
		}
		
		this.building = building;
		this.number = number;
		this.name = building.name + number;
		this.floor = floor;
		
		for (int i = 0; i < this.building.rooms.size(); i++){
			Room token = this.building.rooms.get(i);
			
			if (this.getBuilding() == token.getBuilding() && this.getFloor() == token.getFloor() && this.getNumber() == token.getNumber()){
				throw new DuplicateRoomException();
			}
		}
		
		this.building.rooms.add(this);
	}

	public Room(Building building, String number, int floor, int capacity) throws DuplicateRoomException {
		if (floor < building.minFloor || floor > building.maxFloor){
			throw new IllegalArgumentException();
		}
		
		this.building = building;
		this.number = number;
		this.name = building.name + number;
		this.floor = floor;
		this.capacity = capacity;
		
		for (int i = 0; i < this.building.rooms.size(); i++){
			Room token = this.building.rooms.get(i);
			
			if (this.getBuilding() == token.getBuilding() && this.getFloor() == token.getFloor() && this.getNumber() == token.getNumber()){
				throw new DuplicateRoomException();
			}
		}
		
		this.building.rooms.add(this);
	}

	public Building getBuilding() {
		return building;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getFloor() {
		return floor;
	}
	
	@Override
	public String toString(){
		return "Room(" + this.building.name + "," + this.number + ")";		
	}

	public int getCapacity() {
		return capacity;
	}

	public void authorize(User u1) {
		users.add(u1);
		return;
	}

	public boolean canEnter(User u1) {
		for (int i = 0; i < users.size(); i++){
			if (users.get(i).equals(u1)){
				return true;
			}
		}
		return false;
	}

}
