package chanks_auto;

import interfaces.IProductPart;

public class CarEngine implements IProductPart {
    private String name;
    private double power;

    public CarEngine(double power) {
        this.name = "Двигатель автомобиля";
        this.power = power;
    }
    @Override
    public String getName() {
        return name + " (" + power + " л.с.)";
    }

    public double getPower() {
        return power;
    }
}
