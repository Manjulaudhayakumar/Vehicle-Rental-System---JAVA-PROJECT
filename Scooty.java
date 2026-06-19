package Vehicle;

class Scooty extends VehicleRent{

    Scooty(String ID,String brand,double rentPerDay){

        this.ID = ID;
        this.type = "Scooty";
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }
}