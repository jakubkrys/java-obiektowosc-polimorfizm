public class ToyShopRepo {

    /*private Bear[] bears = new Bear[10];
    private int bearIndex = 0;
    private Car[] cars = new Car[10];
    private int carIndex = 0;
    private Puzzle[] puzzles = new Puzzle[10];
    private int puzzleIndex = 0;
    private Book[] books = new Book[10];
    private int bookIndex = 0;*/

    private Toy[] toys = new Toy[40];
    private int toyIndex = 0;


    public void addBear(Bear bear){
        if(toyIndex < toys.length){
            toys[toyIndex++] = bear;
        } else {
            toyIndex = 0;
        }
    }

    public void addCar(Car car) {
        if (toyIndex < toys.length) {
            toys[toyIndex++] = car;
        } else {
            toyIndex = 0;
        }
    }

    public void addPuzzle(Puzzle puzzle) {
        if (toyIndex < toys.length) {
            toys[toyIndex++] = puzzle;
        } else {
            toyIndex = 0;
        }
    }

    public void addBook(Book book) {
        if (toyIndex < toys.length) {
            toys[toyIndex++] = book;
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
