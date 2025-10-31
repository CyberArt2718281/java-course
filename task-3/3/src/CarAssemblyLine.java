import interfaces.IAssemblyLine;
import interfaces.ILineStep;
import interfaces.IProduct;
import interfaces.IProductPart;

// CarAssemblyLine.java
public class CarAssemblyLine implements IAssemblyLine {
    private ILineStep bodyStep;
    private ILineStep chassisStep;
    private ILineStep engineStep;

    public CarAssemblyLine(ILineStep bodyStep, ILineStep chassisStep, ILineStep engineStep) {
        this.bodyStep = bodyStep;
        this.chassisStep = chassisStep;
        this.engineStep = engineStep;
        System.out.println("Сборочная линия автомобилей инициализирована");
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        System.out.println("\n*** НАЧАЛО СБОРКИ АВТОМОБИЛЯ ***");

        // Шаг 1: Изготовление и установка кузова
        System.out.println("\n--- Этап 1: Работа с кузовом ---");
        IProductPart body = bodyStep.buildProductPart();
        product.installFirstPart(body);

        // Шаг 2: Изготовление и установка шасси
        System.out.println("\n--- Этап 2: Работа с шасси ---");
        IProductPart chassis = chassisStep.buildProductPart();
        product.installSecondPart(chassis);

        // Шаг 3: Изготовление и установка двигателя
        System.out.println("\n--- Этап 3: Работа с двигателем ---");
        IProductPart engine = engineStep.buildProductPart();
        product.installThirdPart(engine);

        System.out.println("\n*** СБОРКА АВТОМОБИЛЯ ЗАВЕРШЕНА ***");
        return product;
    }
}