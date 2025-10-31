import chanks_auto.CarBody;
import chanks_auto.CarChassis;
import chanks_auto.CarEngine;
import interfaces.IProduct;
import interfaces.IProductPart;

// Car.java
public class Car implements IProduct {
    private CarBody body;
    private CarChassis chassis;
    private CarEngine engine;

    public Car() {
        System.out.println("Создана заготовка автомобиля");
    }

    @Override
    public void installFirstPart(IProductPart part) {
        if (part instanceof CarBody body) {
            this.body = body;
            System.out.println(">>> Установлен кузов: " + body.getName());
        }
    }

    @Override
    public void installSecondPart(IProductPart part) {
        if (part instanceof CarChassis chassis) {
            this.chassis = chassis;
            System.out.println(">>> Установлено шасси: " + chassis.getName());
        }
    }

    @Override
    public void installThirdPart(IProductPart part) {
        if (part instanceof CarEngine) {
            this.engine = (CarEngine) part;
            System.out.println(">>> Установлен двигатель: " + part.getName());
        }
    }

    public void displayCarInfo() {
        System.out.println("\n=== ИНФОРМАЦИЯ ОБ АВТОМОБИЛЕ ===");
        System.out.println("Кузов: " + (body != null ? body.getMaterial() : "не установлен"));
        System.out.println("Шасси: " + (chassis != null ? chassis.getWheelCount() + " колес" : "не установлено"));
        System.out.println("Двигатель: " + (engine != null ? engine.getPower() + " л.с." : "не установлен"));
        System.out.println("==============================\n");
    }
}