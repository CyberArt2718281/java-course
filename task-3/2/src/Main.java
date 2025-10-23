public class Main {
    public static void main(String[] args) {

        Sklad sklad = new Sklad(250);
        Product product1 = new FoodProduct(50);
        Product product2 = new ElectronicProduct(70);
        Product product3 = new FoodProduct(30);
        Product product4 = new ElectronicProduct(60);

        sklad.addProduct(product1);
        sklad.addProduct(product2);
        sklad.addProduct(product3);
        sklad.addProduct(product4);

        System.out.println(sklad.getTotalWeight());
    }
}