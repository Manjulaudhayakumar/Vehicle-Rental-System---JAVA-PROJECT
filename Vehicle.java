package Vehicle;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Vehicle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VehicleRent[] vehicles = new VehicleRent[12];
	vehicles[0] = new Car("V101","Toyota",1500);
	vehicles[1] = new Car("V102","Honda",1300);
	vehicles[2] = new Car("V103","Skoda",1700);
	vehicles[3] = new Car("V104","Maruti Swift",1800);
	vehicles[4] = new Bike("V105","Yamaha",700);
	vehicles[5] = new Bike("V106","Royal Enfield",900);
	vehicles[6] = new Bike("V107","KTM RC 390",1500);
	vehicles[7] = new Bike("V108","Suzuki Gixxer SF",1900);
	vehicles[8] = new Scooty("V109","Activa",500);
	vehicles[9] = new Scooty("V110","Jupiter",550);
	vehicles[10] = new Scooty("v111","Suzuki access 125",1000);
	vehicles[11] = new Scooty("V112","Yamaha RayZR",1200);
	
	int choice;
	do {
		System.out.println("--------------------------VEHICLE RENTAL SYSTEM---------------------------");
		System.out.println("1.Show all vehicles");
		System.out.println("2.Rent a Vehicle");
		System.out.println("3.Return a Vehicle");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice){
		case 1 :
			System.out.println("Vehicles List");
			for(int i =0;i<vehicles.length;i++) {
				vehicles[i].displayDetails();
			}
			break;
		case 2:
			System.out.println("Enter Vehicle ID for rent:");
			String rentID =sc.next();
			boolean foundToRent = false;
			for(int i =0;i<vehicles.length;i++) {
				if(vehicles[i].ID.equals(rentID)) {
					foundToRent = true;
					if(vehicles[i].isAvailable) {
						System.out.println("Enter Customer name:");
						String name = sc.next();
						System.out.println("Enter Customer phone number:");
						long phone = sc.nextLong();
						System.out.println("Enter Customer's Aadhar Num:");
						long aadhar = sc.nextLong();
						 Customer cust = new Customer(name,phone,aadhar);
						System.out.println("Enter Number of days:");
					    int days = sc.nextInt();
					    double totalRent = days*vehicles[i].rentPerDay;
					    vehicles[i].isAvailable = false;
					    try {

					        Connection con = DBConnection.getConnection();

					        String sql =
					            "UPDATE vehicles SET is_available=false WHERE vehicle_id=?";

					        PreparedStatement ps =
					            con.prepareStatement(sql);

					        ps.setString(1, rentID);

					        ps.executeUpdate();

					    } catch(Exception e) {

					        e.printStackTrace();
					    }
					System.out.println("---------------------------BILL------------------------------------");
					System.out.println("Vehicle Successfully Rented");
					cust.displayCustomer();
					System.out.println("Vehicle Type:"+vehicles[i].type);
					System.out.println("Vehicle Brand:"+vehicles[i].brand);
					System.out.println("Days:"+days);
					System.out.println("Total Rent:"+totalRent);
					System.out.println("Have a Happy Journey");
				}
					else {
						System.out.println("Vehicle Already Rented");
					}
					break;
				}	
		}
			if(!foundToRent) {
				System.out.println("Invalid Vehicle ID");
			}	
            break;
			
		case 3 :

		    System.out.println("Enter vehicleID to return:");
		    String returnID = sc.next();

		    boolean foundToReturn = false;

		    for(int i = 0; i < vehicles.length; i++) {

		        if(vehicles[i].ID.equals(returnID)) {

		            foundToReturn = true;

		            if(!vehicles[i].isAvailable) {

		                vehicles[i].isAvailable = true;

		                try {

		                    Connection con = DBConnection.getConnection();

		                    String sql =
		                        "UPDATE vehicles SET is_available=true WHERE vehicle_id=?";

		                    PreparedStatement ps =
		                        con.prepareStatement(sql);

		                    ps.setString(1, returnID);

		                    ps.executeUpdate();

		                } catch(Exception e) {

		                    e.printStackTrace();
		                }

		                System.out.println("Vehicle Successfully Returned");

		            } else {

		                System.out.println("This vehicle was not rented");

		            }

		            break;
		        }
		    }

		    if(!foundToReturn) {

		        System.out.println("Invalid Vehicle ID");

		    }

		    break;
			
		case 4:
			System.out.println("Thank you for using Vehicle Rental System");
			break;	
			
		default:
			System.out.println("Invalid Choice ! Please Try Again");
			break;
	  }
	}
	while(choice!=4);
	sc.close();
}
}