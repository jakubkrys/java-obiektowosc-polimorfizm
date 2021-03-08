import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToyShopRepo toyShopRepo = new ToyShopRepo();
        char option;
        String name;
        double price;

        do {
            System.out.println("----- Toy Shop App -----");
            System.out.println("1 - add bear");
            System.out.println("2 - add car");
            System.out.println("3 - add puzzle");
            System.out.println("4 - add book");
            System.out.println("5 - display all toys");
            System.out.println("0 - quit");
            option = scanner.nextLine().charAt(0);

            switch (option) {
                case '1':
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n
                    System.out.print("Material: ");
                    String material = scanner.nextLine();

                    Bear bear = new Bear(name,price,material);
                    toyShopRepo.addBear(bear);
                    break;
                case '2':
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n
                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    Car car = new Car(name,price,type);
                    toyShopRepo.addCar(car);
                    break;
                case '3':
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n
                    System.out.print("Amount of pieces: ");
                    int piecesAmount = scanner.nextInt();
                    scanner.nextLine();

                    Puzzle puzzle = new Puzzle(name,price,piecesAmount);
                    toyShopRepo.addPuzzle(puzzle);
                    break;
                case '4':
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n
                    System.out.print("Amount of pages: ");
                    int pagesAmount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(name,price,pagesAmount,age);
                    toyShopRepo.addBook(book);
                    break;
                case '5':
                    toyShopRepo.displayAll();
                    break;
                case '0':
                    break;
                default:
                    System.out.println("You've chosen option that doesn't exist.");
                    break;
            }
        } while (option != '0');
        scanner.close();
    }
}
