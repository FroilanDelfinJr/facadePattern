package facadePattern;

public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping (int roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public void service() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber){
        System.out.println("The housekeeper will clean room " + roomNumber);
    }
}
