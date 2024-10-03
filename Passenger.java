/**
 * represents passenger who can board and exit a car
 * passenger has a name attribute and can interact with the car class to get on and off a car
 */
public class Passenger {

    private String name;
  
    /**
     * constructs a passenger with a naem
     * 
     * @param name name of the passenger
     */
    public Passenger(String name) {
      this.name = name;
    }
  
    /**
     * returns name of passenger
     * 
     * @return name of passenger
     */
    public String getName() {
      return name;
    }
  
    /**
     * allows passenger to attempt to board a specific car
     * sucessful boarding is indicated by a success message
     * if car is full, failure message is printed
     * 
     * @param c car passenger is attempting to board
     */
    public void boardCar(Car c) {
      if (c.addPassenger(this) == true) {
        System.out.println("Boarding was sucessful.");
      } else {
        System.out.println("Boarding was NOT sucessful.");
      }
  
    }
  
    /**
     * allows passenger to attempt to exit car
     * message is printed indicating success/failure of operation
     * 
     * @param c the car the passenger is attempting to exit
     */
    public void getOffCar(Car c) {
      if (c.removePassenger(this) == true) {
        System.out.println("The passenger has exited the car.");
      }
  
    }
  }