/**
 * represents engine that operates using a specific fuel type
 * manages current and max fuel levels
 * tracks fuel consumption
 */
public class Engine {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;
  
    /**
     * constructs an engine with a fuel type and max fuel level
     * 
     * @param fuelType type of fuel engine runs on
     * @param maxFuelLevel max fuel capacity of engine
     */
    public Engine(FuelType fuelType, double maxFuelLevel) {
      this.fuelType = fuelType;
      this.currentFuelLevel = maxFuelLevel;
      this.maxFuelLevel = maxFuelLevel;
    }
  
    /**
     * returns fuel type of engine
     * 
     * @return fuel type
     */
    public FuelType getFuelType() {
      return fuelType;
    }
  
    /**
     * returns current fuel level of engine
     * 
     * @return current fuel level
     */
    public double getCurrentFuelLevel() {
      return currentFuelLevel;
    }
  
    /**
     * returns max fuel level of engine
     * 
     * @return max fuel level
     */
    public double getMaxFuelLevel() {
      return maxFuelLevel;
    }
  
    /**
     * refuels engine to max capacity
     */
    public void refuel() {
      currentFuelLevel = maxFuelLevel;
    }
  
    /**
     * simulates operating of engine and consumes fuel
     * reduces fuel level of one third of max fuel level
     * 
     * @return true if fuel remains after operation, false otherwise
     */
    public boolean go() {
      currentFuelLevel = currentFuelLevel - maxFuelLevel / 3.0;
      System.out.println("Remaining Fuel Level: " + currentFuelLevel);
      if (currentFuelLevel > 0) {
        return true;
      } else {
        return false;
      }
    }
  
  }