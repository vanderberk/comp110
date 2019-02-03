
public class Room {
	private String roomType;
	private int width;
	private int height;
	
	Room(String roomType) {
		this.roomType = roomType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "[roomType=" + roomType + ", width=" + width + ", height=" + height + ", area=" + (width*height) + "]";
	}
}
