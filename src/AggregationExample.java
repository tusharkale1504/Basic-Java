class Address {
    String houseNo;
    String city;
    String country;

    public Address(String houseNo, String city, String country) {
        this.houseNo = houseNo;
        this.city = city;
        this.country = country;
    }
}

class Employees {
    String name;
    Address address;

    public Employees(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.houseNo + ", " + address.city + ", " + address.country);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address a1 = new Address("NH48", "Sangamner", "India");
        Employees e1 = new Employees("Tushar", a1);
        e1.displayDetails();
    }
}
