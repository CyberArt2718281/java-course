package chanks_auto;

import interfaces.IProductPart;

public class CarChassis implements IProductPart {
    private String name;
    private int wheelCount;

    public CarChassis(int wheelCount) {
        this.name = "Шасси автомобиля";
        this.wheelCount = wheelCount;
    }

    @Override
    public String getName() {
        return name + " (" + wheelCount + " колес)";
    }

    public int getWheelCount() {
        return wheelCount;
    }
}
