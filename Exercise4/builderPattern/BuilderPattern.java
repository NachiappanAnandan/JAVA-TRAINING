package builderPattern;

public class BuilderPattern {
	public static void main(String[] args) {
		Room CreateRoom = new Room.RoomBuilder().BuildRoom();
		
		System.out.println(CreateRoom);
	}
}
