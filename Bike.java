package Vehicle;

class Bike extends VehicleRent{

    Bike(String ID,String brand,double rentPerDay){

        this.ID = ID;
        this.type = "Bike";
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }
}