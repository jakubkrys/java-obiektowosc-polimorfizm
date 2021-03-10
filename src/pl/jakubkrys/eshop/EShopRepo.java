package pl.jakubkrys.eshop;

public class EShopRepo {

    Product[] products = new Product[50];
    private int productIndex = 0;

    public void add(Product product) {
        if(productIndex == products.length){
            productIndex = 0;
        }
        products[productIndex++] = product;
    }

    public void displayAll() {
        for (int i = 0; i < productIndex; i++) {
            products[i].display();
        }
    }
}
