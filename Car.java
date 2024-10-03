import java.util.ArrayList;

/**
 * -represents a train car that carries passengers
 * -allows for the adding and removing of passengers from a car
 * -also allows for the checking a the car's capacity and max capacity
 */
public class Car {

  private int maxCapacity;
  private ArrayList < Passenger > passengerList;

  /**
   * constructs a car object with a max capacity
   * 
   * @param maxCapacity represents max number of passengers the car holds
   */
  public Car(int maxCapacity) {

    this.maxCapacity = maxCapacity;
    this.passengerList = new ArrayList < > (maxCapacity);
  }

  /**
   * returns max capacity of the car
   * 
   * @return max capacity of the car
   */
  public int getCapacity() {
    return maxCapacity;
  }

  /**
   * returns the number of seats that remain in the car
   * 
   * @return number of available seats left in the car
   */
  public int seatsRemaining() {
    return maxCapacity - passengerList.size();
  }

  /**
   * checks for available capacity before adding a passenger to the car
   * 
   * @param p the passenger object that is attempting to be added
   * @return true if the passenger was added, false otherwise
   */
  public boolean addPassenger(Passenger p) {
    if (passengerList.size() < maxCapacity) {
      passengerList.add(p);
      return true;
    } else if (passengerList.size() == maxCapacity) {
      System.out.println("This car is full.");
      return false;
    } else {
      return false;
    }

  }

  /**
   * checks that the passenger is on board before removing them
   * 
   * @param p the passenger that is attempting to be removed
   * @return true if the passenger was sucessfully removed, false otherwise
   */
  public boolean removePassenger(Passenger p) {
    if (passengerList.contains(p)) {
      passengerList.remove(p);
      return true;
    } else {
      System.out.println("That passenger is not on board this car.");
      return false;
    }

  }

  /**
   * prints list of names of passengers currently in the car
   * if the car is empty, a message will print that
   */
  public void printManifest() {
    System.out.println("-+------------------+-");
    if (passengerList.size() > 0) {
      for (Passenger p: passengerList) {
        System.out.println(p.getName());
      }
    } else {
      System.out.println("This car is EMPTY.");
    }
    System.out.println("-+------------------+-");
  }

}