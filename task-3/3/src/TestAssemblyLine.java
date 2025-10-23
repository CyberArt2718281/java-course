import assembling_steps.BodyLineStep;
import assembling_steps.ChassisLineStep;
import assembling_steps.EngineLineStep;
import interfaces.IAssemblyLine;
import interfaces.ILineStep;
import interfaces.IProduct;

// TestAssemblyLine.java
public class TestAssemblyLine {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ СБОРОЧНОЙ ЛИНИИ АВТОМОБИЛЕЙ ===\n");

        // Создаем шаги сборки
        ILineStep bodyStep = new BodyLineStep();
        ILineStep chassisStep = new ChassisLineStep();
        ILineStep engineStep = new EngineLineStep();

        // Создаем сборочную линию
        IAssemblyLine assemblyLine = new CarAssemblyLine(bodyStep, chassisStep, engineStep);

        // Создаем заготовку автомобиля
        Car car = new Car();

        // Запускаем сборку
        IProduct assembledCar = assemblyLine.assembleProduct(car);

        // Показываем информацию о собранном автомобиле
        if (assembledCar instanceof Car carObj) {
            carObj.displayCarInfo();
        }

        System.out.println("=== ТЕСТИРОВАНИЕ ЗАВЕРШЕНО ===");
    }
}