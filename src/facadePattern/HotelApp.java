package facadePattern;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("============Hotel Services============");
            System.out.println("[1] Valet");
            System.out.println("[2] House Keeping");
            System.out.println("[3] Cart");
            System.out.println("[4] Exit");
            System.out.print("\nChoose a service: ");
            Integer choice = input.nextInt();
            input.nextLine();
            System.out.println();

            HotelService valet= null;
            HotelService houseKeeping= null;
            HotelService cart= null;

            switch(choice){
                case 1:
                    System.out.print("Enter the plate number: ");
                    String plateNumber = input.nextLine();
                    valet = new Valet(plateNumber);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter room number: ");
                    Integer roomNumber = input.nextInt();
                    houseKeeping = new HouseKeeping(roomNumber);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter number of cart/s: ");
                    Integer numberOfCarts = input.nextInt();
                    cart = new Cart(numberOfCarts);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting the Hotel Management System. Thank you for using our services!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }

            FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

            if (choice == 1) {
                    frontDesk.requestService(valet);
            }

            if (choice == 2) {
                    frontDesk.requestService(houseKeeping);
            }

            if (choice == 3) {
                    frontDesk.requestService(cart);
            }

            System.out.println();
        }
    }
}
