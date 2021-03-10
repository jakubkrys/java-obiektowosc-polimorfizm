package pl.jakubkrys.eshop;
public class Producer{

    private String vatNumber;
    private String companyName;
    private Address address;

    public Producer(String street, int houseNumber, int flatNumber, String postcode, String town, String vatNumber, String companyName) {
        this.address = new Address(street, houseNumber, flatNumber, postcode, town);
        this.vatNumber = vatNumber;
        this.companyName = companyName;
    }

    public void display() {
        address.display();
        System.out.println("VAT number: "+vatNumber);
        System.out.println("Company name: "+companyName);
    }
}
