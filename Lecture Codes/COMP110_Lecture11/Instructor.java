
public class Instructor extends Person { 
	
	public int roomNo;

	public Instructor(String name, int age, int roomNo) {
		super(name,age);
		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return "Instructor " + super.toString() + ", Room=" + roomNo;
	}
	
	public void chageRoom() {
		roomNo  += 1;
	}
}
