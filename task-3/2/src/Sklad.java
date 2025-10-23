

import java.util.ArrayList;
import java.util.List;

public class Sklad {
    private double maxWeight;
    private List<Product> products = new ArrayList();

    public Sklad(double var1) {
        this.maxWeight = var1;
    }

    public boolean addProduct(Product var1) {
        if (this.getTotalWeight() + var1.getWeight() <= this.maxWeight) {
            this.products.add(var1);
            return true;
        } else {
            return false;
        }
    }


    public List<Product> addProducts(List<Product> newProducts) {
        List<Product> notAdded = new ArrayList<>();
        for (Product p : newProducts) {
            if (!addProduct(p)) {
                notAdded.add(p);
            }
        }
        return notAdded;
    }

    public double getTotalWeight() {
        return this.products.stream().mapToDouble(Product::getWeight).sum();
    }
}
