package coursework1;

/*
 * @author b00348736
 */
public class DealershipTest {

    public static void main(String[] args) {
        Integer carListSize = Input.getInteger("Car list Size:");
        CarList cars = new CarList(carListSize);
        Dealership getMake;
        String make;
        String model;
        String colour;
        String reg;
        String search;
        Integer option;
        Integer ExitConfirm;
        /* Adding to elements to array */
        
        do {
            
        	System.out.println("0: QUIT");
            System.out.println("1: DISPLAY");
            System.out.println("2: ADD Car");
            System.out.println("3: SEARCH");
            System.out.println("4: Remove Car");
           
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

                /*EXCEPTION IMPLEMENTED*/

                  else if (ExitConfirm == 2 ) {
                    throw new ArithmeticException ("Invalid Input stopping program");
                }
             /* Display Details */
                case 1:
                	if (carListSize == 0) {
                		System.out.println("No Data in Array");
                	}
                	else
                	{
                		System.out.println(cars);
                	}
                    break;

                    /* Enter car details */
                case 2:
                            
                	System.out.println("0: Return to menu");
                    System.out.println("1: ford");
                    System.out.println("2: tesla");
                    System.out.println("3: toyota");
                    System.out.println("4: audi");
                	option = Input.getInteger("Option: ");
                	switch(option) {
                	case 0:
                		System.out.println("Returning to menu");
                		break;
                		
                	case 1:
                		make = new String("ford");
                		model = Input.getString("Model: ");
                        colour = Input.getString("Colour: ");
                        reg = Input.getString("Registration Plate: ");
                        cars.addCar(make,model,reg,colour);
                        break;
                        
                	case 2:
                		make = new String("tesla");
                		model = Input.getString("Model: ");
                        colour = Input.getString("Colour: ");
                        reg = Input.getString("Registration Plate: ");
                        cars.addCar(make,model,reg,colour);
                        break;
                	case 3:
                        make = new String("toyota");
                		model = Input.getString("Model: ");
                        colour = Input.getString("Colour: ");
                        reg = Input.getString("Registration Plate: ");
                        cars.addCar(make,model,reg,colour);
                        break;
                	case 4:
                        make = new String("audi");
                		model = Input.getString("Model: ");
                        colour = Input.getString("Colour: ");
                        reg = Input.getString("Registration Plate: ");
                        cars.addCar(make,model,reg,colour);
                        break;
                	}
                	
                	break;
                       		//make = Input.getString("Manufacturer: ");
                            
                	 
                            /* Search dealership for a specific make of car*/    
                case 3:
                	String searchMake = Input.getString("Manufacturer: ");
                	if (cars.search(searchMake)) {
                		System.out.println(true);
                		break;
                	}
                	else {
                		System.out.println(false);
                		break;
                	}
                case 4:
                    System.out.println("This Doesnt Work yet");
                default:
                    System.out.println("Invalid Option");
            }

        } while (option != 0);
    }

 
}
