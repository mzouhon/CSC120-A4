public class Engine {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=currentFuelLevel;
        this.maxFuelLevel=maxFuelLevel;
    }

    public FuelType getfuelType(){
        return fuelType;
    }

    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    public double getMaxFuelLevel(){
        return maxFuelLevel;
    }

    public void refuel(){
        currentFuelLevel=maxFuelLevel;
    }

    public boolean go(){
        currentFuelLevel= currentFuelLevel-maxFuelLevel/3.0;
        System.out.println("");
        if(currentFuelLevel>0){
            return true;
        }else{
            return false;
        }
    }


}