import java.util.ArrayList;
/**
 * represents a train that has an engine and cars
 * allows for managing of the engine and the cars
 * allows for the retrieving of their details
 * can also calculate maximum passenger capacity.
 * 
 */
public class Train {

  private Engine engine;
  private ArrayList < Car > cars;

  /**
   * Constructs a train with the specified fuel type, fuel capacity,
   * number of cars, and passenger capacity for each car. 
   * 
   * @param fuelType fuel type engine uses
   * @param fuelCapacity max fuel capcity of engine
   * @param nCars number of cars the train has
   * @param passengerCapacity the max number of passengers that can fit in each car
   */
  public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {

    this.engine = new Engine(fuelType, fuelCapacity);
    this.cars = new ArrayList < > ();

    for (int i = 0; i < nCars; i++) {
      cars.add(new Car(passengerCapacity));
    }
  }

  /**
   * returns engine of train
   * 
   * @return engine 
   */
  public Engine getEngine() {
    return engine;
  }

  /**
   * returns the car at the specified index
   * 
   * @param i index of car being retrieved in array list
   * @return car at the specified index
   */
  public Car getCar(int i) {
    return cars.get(i);
  }

  /**
   * calculates and returns max passenger capacity of train
   * 
   * @return max passenger capacity
   */
  public int getMaxCapacity() {
    System.out.println(cars.size() * cars.get(0).getCapacity());
    return cars.size() * cars.get(0).getCapacity();
  }
}