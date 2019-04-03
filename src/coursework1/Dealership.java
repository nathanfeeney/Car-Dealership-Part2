
package coursework1;

/**
 *
 * @author b00348736
 */
public class Dealership {
   private String make;
   private String model;
   private String reg;
   private String colour;
   
    
    public Dealership(String make, String model, String colour, String reg){
    	this.make = make;
        this.model = model;
        this.colour = colour;
        this.reg = reg;

}
    public String getMake() {
    	return make;
    }
    public String toString(){
        String carDetails=new String();
        carDetails+=this.make;
        carDetails+=this.model;
        carDetails+=this.colour;
        carDetails+=this.reg;
        
        carDetails=String.format("%-20s%-20s%-20s%-20s",this.make, this.model, this.colour, this.reg);
        return carDetails;
    }
   
}

