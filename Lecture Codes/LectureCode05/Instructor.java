public class Instructor extends Person {
	private String room;
	
	Instructor(){
		// secretly calls super()
	}
	
	Instructor(String name, int age, String room) {
		super(name,age);
		setRoom(room);
		System.out.println("Instructor's constructor is called");
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	public String toString() {
		return super.toString() + ", Room: " + room;
	}
}
