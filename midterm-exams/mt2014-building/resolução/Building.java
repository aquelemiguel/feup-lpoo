import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Building implements Facility {

	String name;
	int minFloor, maxFloor, capacity;
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	public Building(){
		super();
	}
	
	public Building(String name, int minFloor, int maxFloor) {
		if (minFloor > maxFloor){
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
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

	@Override
	public String toString(){
		return "Building(" + this.name + ")";			
	}

	public int getCapacity() {
		int fullCapacity = 0;
		
		for (int i = 0; i < rooms.size(); i++){
			fullCapacity += rooms.get(i).capacity;
		}
		return fullCapacity;
	}

	@Override
	public boolean canEnter(User u1) {
		for (int i = 0; i < rooms.size(); i++){
			if (rooms.get(i).canEnter(u1)){
				return true;
			}
		}
		return false;
	}
	
}
