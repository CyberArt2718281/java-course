package assembling_steps;

import chanks_auto.CarBody;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class BodyLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("=== Шаг 1: Изготовление кузова ===");
        System.out.println("Производим штамповку кузова...");
        System.out.println("Свариваем детали кузова...");
        System.out.println("Наносим антикоррозийное покрытие...");
        CarBody body = new CarBody("сталь");
        System.out.println("Кузов готов: " + body.getName());
        return body;
    }
}
