package facadePattern;

public class Valet implements HotelService{
    private String plateNumber;

    public Valet (String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override
    public void service(){
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("The car with plate number "  + plateNumber + " will be picked up by the valet");
    }
}
