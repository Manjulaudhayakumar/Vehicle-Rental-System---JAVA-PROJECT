package Vehicle;


class Customer {

    String name;
    long Phone;
    long aadhar;

    Customer(String name,long phone,long aadhar){

        this.name = name;
        this.Phone = phone;
        this.aadhar = aadhar;
    }

    void displayCustomer(){

        System.out.println("Customer Name : " + name);
        System.out.println("Phone         : " + Phone);
        System.out.println("Aadhar Number : " + aadhar);
    }
}