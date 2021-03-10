package pl.jakubkrys.eshop;

import pl.jakubkrys.eshop.Address;

public class Author{

    private String authorName;
    private String authorSurname;
    private Address address;

    public Author(String street, int houseNumber, int flatNumber, String postcode, String town, String authorName, String authorSurname) {
        this.address = new Address(street, houseNumber, flatNumber, postcode, town);
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public void display() {
        address.display();
        System.out.println("Author name: "+authorName);
        System.out.println("Author surname: "+authorSurname);
    }
}
