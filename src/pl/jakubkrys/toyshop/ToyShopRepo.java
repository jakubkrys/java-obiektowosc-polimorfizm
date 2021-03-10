package pl.jakubkrys.toyshop;

public class ToyShopRepo {

    private Toy[] toys = new Toy[40];
    private int toyIndex = 0;

    public void add (Toy toy){
        if(toyIndex < toys.length){
            toys[toyIndex++] = toy;
        } else {
            toyIndex = 0;
        }
    }

    public void displayAll(){
        for (int i = 0; i < toyIndex; i++) {
            toys[i].display();
        }
    }
}
