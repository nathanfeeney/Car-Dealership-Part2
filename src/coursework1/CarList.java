
package coursework1;

/**
 *
 * @author b00348736
 */
public class CarList {
   private Dealership[] cars;
   private Integer numberOfCars;
   
   public CarList(Integer carListSize){
       this.cars=new Dealership[carListSize];
       this.numberOfCars=0;
   }
   
   public void addCar(String make, String model, String reg, String colour){
       this.cars[this.numberOfCars]=new Dealership(make, model, colour, reg);
       this.numberOfCars++;
   }
    boolean search (String make) {
    	for(int i=0; i< cars.length; i++) {
    		if(make.equals(cars[i].getMake())) {
    			return true;
    		}
    		}
    	return false;
    }

   
    public String toString(){
        String carDetails=new String();
        if(this.numberOfCars!=0){
            carDetails=String.format("%-20s%-20s%-20s%-20s\n","Make","Model ","Colour","Registration");
            for (Integer index = 0; index < this.numberOfCars; index++)
                carDetails += this.cars[index] + "\n";
        }
       else
    	   carDetails+="Car List is EMPTY";
       return carDetails;
   }

}
