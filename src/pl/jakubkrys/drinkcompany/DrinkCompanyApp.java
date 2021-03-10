package pl.jakubkrys.drinkcompany;

import java.util.Scanner;

public class DrinkCompanyApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DrinkCompanyRepo drinkCompanyRepo = new DrinkCompanyRepo();
        int option;

        do{
            System.out.println("----- Drink Company App -----");
            System.out.println("1 - add beer");
            System.out.println("2 - add water");
            System.out.println("3 - display all");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();
            int capacity;
            String ingredients;

            switch (option){
                case 1:
                    System.out.print("Capacity: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine(); // \n
                    System.out.print("Ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.print("Alcohol strength: ");
                    double alcoholStrength = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    Beer beer = new Beer(capacity,ingredients,alcoholStrength);
                    drinkCompanyRepo.add(beer);
                    break;
                case 2:
                    System.out.print("Capacity: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine(); // \n
                    System.out.print("Ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    Water water = new Water(capacity,ingredients,type);
                    drinkCompanyRepo.add(water);
                    break;
                case 3:
                    drinkCompanyRepo.displayAll();
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
