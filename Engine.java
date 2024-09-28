public class Engine {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=currentFuelLevel;
        this.maxFuelLevel=maxFuelLevel;
    }

    public FuelType getFuelType(){
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
        System.out.println("Remaining Fuel Level: "+ currentFuelLevel);
        if(currentFuelLevel>0){
            return true;
        }else{
            return false;
        }
    }
    
    //test
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");

        Car myCar=new Car(3);
        System.out.println(myCar.seatsRemaining());
    }
}