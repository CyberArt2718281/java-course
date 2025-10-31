package chanks_auto;

import interfaces.IProductPart;

public class CarBody implements IProductPart {
    private String name;
    private String material;

    public CarBody(String material) {
        this.name = "Кузов автомобиля";
        this.material = material;
    }

    @Override
    public String getName() {
        return name + " (" + material + ")";
    }

    public String getMaterial() {
        return material;
    }
}
