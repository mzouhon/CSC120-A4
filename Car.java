import java.util.ArrayList;

public class Car {

    private int maxCapacity;
    private ArrayList<Passenger> passengerList;
   
    public Car(int maxCapacity){
        
        this.maxCapacity=maxCapacity;
        this.passengerList=new ArrayList<>(maxCapacity);
    }

    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
       return maxCapacity-passengerList.size();
    }

    public boolean addPassenger(Passenger p){
       if (passengerList.size()<maxCapacity){
        passengerList.add(p);
        return true;
       }else if(passengerList.size()==maxCapacity){
        System.out.println("The car is full.");
        return false;
       }else{
        return false;
       }
       
        
    }

    public boolean removePassenger(Passenger p){
        if(passengerList.contains(p)){
            passengerList.remove(p);
            return true;
        }else{
            System.out.println("That passenger is not on board this car.");
            return false;
        }
       
    }

    public void printManifest(){
        if (passengerList.size()>0){
            for(Passenger p: passengerList){
                System.out.println(p);
            }
        }else{
            System.out.println("This car is EMPTY.");
        }
    }

    

}