package coursework1;

/*
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
        Integer ExitConfirm;
        do {
            
        	System.out.println("0: QUIT");
            System.out.println("1: DISPLAY");
            System.out.println("2: SEARCH");
            System.out.println("3: ADD Car");
           
            option = Input.getInteger("Option:");
            switch (option) {
            
            /* EXIT PROGRAM */
            case 0:
                System.out.println("Are you sure you wish to quit the program?");
                System.out.println("0: exit");
                System.out.println("1: cancel");
                ExitConfirm = Input.getInteger("0 or 1: ");
                if (ExitConfirm == 0) {
                	System.out.println("You are now exiting program, Goodbye.");
                	System.exit(0);
                	
                	
                } else if (ExitConfirm == 1) {
                	System.out.println("Returning to menu..");
                	break;
                }
          
             /* Display Details */
                case 1:
                	if (carListSize == 0) {
                		System.out.println("No Data in Array");
                	}else {
                		System.out.println(cars);
                	}
                	
                    break;

                    /* Enter car details */
                case 2:
                            
                       make = Input.getString("Manufacturer: ");
                            model = Input.getString("Model: ");
                            colour = Input.getString("Colour: ");
                            reg = Input.getString("Registration Plate: ");
                            cars.addCar(make,model,reg,colour);
                            break;
                	 
                            /* Search dealership for a specific make of car*/    
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
