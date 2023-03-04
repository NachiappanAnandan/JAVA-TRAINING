package builderPattern;

public class Room {

	
//	Room Constructor of Room Builder

	
//	class of Romm template to build

	class RoomTemplate{
		String Door,Window,Chair, Table ,Bed , Fan , Ac , Shelf ,KitchenAppliances;
		
		RoomTemplate(String Door,String Window,String Chair,String  Table ,String Bed ,String  Fan ,String  Ac ,String  Shelf ,String KitchenAppliances){
			this.Door = Door;
			this.Window = Door;
			this.Chair = Chair;
			this.Table = Table;
			this.Bed = Bed;
			this.Fan = Fan;
			this.Ac = Ac;
			this.Shelf = Shelf;
			this.Shelf = Shelf;
			
		}
		
		 
//		creating reference of roomTemplate in room class to build

		
		
//		To view the parameters of the object
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "The room Is designed in the format Door - "+Door+" , Window - "+Window+", Chair - "+Chair+", Table - "+Table+", Bed - "+Bed+", Fan - "+Fan+",Ac - "+Ac+",Shelf - "+Shelf+",KitchenAppliances - s"+KitchenAppliances;
		}
		
	}
	
	RoomTemplate RT ;
	public Room(RoomBuilder builder){
		
//		Building the template inside the constructor
		
		RT = new RoomTemplate(builder.Door, builder.Window, builder.Chair, builder.Table, builder.Bed, builder.Fan, builder.Ac, builder.Shelf, builder.KitchenAppliances);
		
	}
	
	
	
	
	
	
//	Class for building the room
	//Being static because access without object creation
	static class RoomBuilder{
		String Door,Window,Chair, Table ,Bed , Fan , Ac , Shelf ,KitchenAppliances;
		
//		Building seperate components and returing self objects
		
		public RoomBuilder setDoor(String Door) {
			this.Door = Door;
			return this;
		}
		public RoomBuilder setWindow(String Window) {
			this.Window = Window;
			return this;
		}
		public RoomBuilder setChair(String Chair) {
			this.Chair = Chair;
			return this;
		}
		public RoomBuilder setTable(String Table) {
			this.Table = Table;
			return this;
		}
		public RoomBuilder setBed(String Bed) {
			this.Bed = Bed;
			return this;
		}
		public RoomBuilder setFan(String Fan) {
			this.Fan = Fan;
			return this;
		}
		public RoomBuilder setAc(String Ac) {
			this.Door = Ac;
			return this;
		}
		public RoomBuilder setShelf(String Shelf) {
			this.Shelf = Shelf;
			return this;
		}
		public RoomBuilder setKitchenAppliances(String KitchenAppliances) {
			this.KitchenAppliances = KitchenAppliances;
			return this;
		}
		
		public Room BuildRoom () {
			return new  Room(this);
		}
		
		
	}
	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Room "+RT;
		}
}
