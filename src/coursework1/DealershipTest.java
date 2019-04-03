package coursework1;

/**
 *
 * @author b00348736
 */
public class DealershipTest {

    public static void main(String[] args) {
        Integer carListSize = Input.getInteger("Car list Size:");
        CarList cars = new CarList(carListSize);
        String make;
        String model;
        String colour;
        String reg;
        String search;
        Integer option;
        do {
            System.out.println("0: QUIT");
            System.out.println("1: ADD Car");
            System.out.println("2: DISPLAY");
            System.out.println("3: SEARCH");
            option = Input.getInteger("Option:");
            switch (option) {
                case 0:
                    System.out.println("QUITTING PROGRAM");
                    break;
                case 1:
                    
                    make = Input.getString("Manufacturer: ");
                    model = Input.getString("Model: ");
                    colour = Input.getString("Colour: ");
                    reg = Input.getString("Registration Plate: ");
                    cars.addCar(make,model,reg,colour);
                    break;
                case 2:
                	if (carListSize == 0) {
                		System.out.println("No Data in Array");
                	}else {
                		System.out.println(cars);
                	}
                	
                    break;
                    
                case 3:
                	String searchMake = Input.getString("Manufacturer: ");
                	if (cars.search(searchMake))
                		System.out.println(true);
                	else
                		System.out.println(false);
               
                default:
                    System.out.println("Invalid Option");
            }

        } while (option != 0);
    }

 
}
