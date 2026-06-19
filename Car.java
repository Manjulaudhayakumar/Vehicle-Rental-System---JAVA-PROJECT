package Vehicle;

class Car extends VehicleRent{

    Car(String ID,String brand,double rentPerDay){

        this.ID = ID;
        this.type = "Car";
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }
}