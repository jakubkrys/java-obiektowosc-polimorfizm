package pl.jakubkrys.toyshop;

public class Puzzle extends Toy {

    private int piecesAmount;

    public Puzzle(String name, double price, int piecesAmount) {
        super(name, price);
        this.piecesAmount = piecesAmount;
    }

    public void display(){
        super.display();
        System.out.println("Amount of pieces: "+piecesAmount);
    }
}
