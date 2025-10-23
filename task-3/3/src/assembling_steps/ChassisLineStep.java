package assembling_steps;

import chanks_auto.CarChassis;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class ChassisLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("=== Шаг 2: Изготовление шасси ===");
        System.out.println("Собираем раму...");
        System.out.println("Устанавливаем подвеску...");
        System.out.println("Монтируем колеса и тормозную систему...");
        CarChassis chassis = new CarChassis(4);
        System.out.println("Шасси готово: " + chassis.getName());
        return chassis;
    }
}