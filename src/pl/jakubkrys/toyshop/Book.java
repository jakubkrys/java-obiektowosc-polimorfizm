package pl.jakubkrys.toyshop;

public class Book extends Toy {

    private int pagesAmount;
    private int age;

    public Book(String name, double price, int pagesAmount, int age) {
        super(name, price);
        this.pagesAmount = pagesAmount;
        this.age = age;
    }

    public void display(){
        super.display();
        System.out.println("Amount of pages: "+pagesAmount);
        System.out.println("Age: "+age);
    }
}
