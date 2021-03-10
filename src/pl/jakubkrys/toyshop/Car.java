package pl.jakubkrys.toyshop;

public class Car extends Toy {

    private String type;

    public Car(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public void display(){
        super.display();
        System.out.println("Type: "+type);
    }

}
