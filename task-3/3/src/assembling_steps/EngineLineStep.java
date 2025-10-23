package assembling_steps;

import chanks_auto.CarEngine;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class EngineLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("=== Шаг 3: Изготовление двигателя ===");
        System.out.println("Собираем блок цилиндров...");
        System.out.println("Устанавливаем поршни и коленвал...");
        System.out.println("Монтируем систему зажигания и впрыска...");
        CarEngine engine = new CarEngine(150.0);
        System.out.println("Двигатель готов: " + engine.getName());
        return engine;
    }
}
