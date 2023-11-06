package facadePattern;

public class Cart implements HotelService{
    private int numberOfCarts;

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void service() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts){
        if(numberOfCarts == 1){
            System.out.println("The requested " + numberOfCarts + " cart is coming soon");
        }
        else{
            System.out.println("The requested " + numberOfCarts + " carts are coming soon");
        }
    }
}
