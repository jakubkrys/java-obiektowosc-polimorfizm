package pl.jakubkrys.eshop;

public class Address{

    public String street;
    public int houseNumber;
    public int flatNumber;
    public String postcode;
    public String town;

    public Address(String street, int houseNumber, int flatNumber, String postcode, String town) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postcode = postcode;
        this.town = town;
    }

    public void display(){
        System.out.println("Street: "+street);
        System.out.println("House no. "+houseNumber);
        System.out.println("Flat no. "+flatNumber);
        System.out.println("Postal code: "+postcode);
        System.out.println("Town: "+town);
    }
}
