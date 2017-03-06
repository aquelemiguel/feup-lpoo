
public class User {

	String name;
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj){
		User that = (User) obj;
		
		if (this.getName() == that.getName()){
			return true;
		}
		return false;
	}
}
