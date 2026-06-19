package Vehicle;

class VehicleRent {

    String ID;
    String type;
    String brand;
    double rentPerDay;
    boolean isAvailable;

    VehicleRent(){}

    VehicleRent(String ID,String type,String brand,double rentPerDay){

        this.ID = ID;
        this.type = type;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }

    void displayDetails(){

        System.out.println(
            ID+" | "+
            type+" | "+
            brand+" | "+
            rentPerDay+" | "+
            (isAvailable ? "Available" : "Rented")
        );
    }
}
