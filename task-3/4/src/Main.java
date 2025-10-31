import types.RoomStatus;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Добавление номеров
        hotel.addRoom(new Room(101, 1500));
        hotel.addRoom(new Room(102, 1800));

        // Добавление услуг
        hotel.addService(new Service("Завтрак", 300));
        hotel.addService(new Service("Wi-Fi", 100));

        // Заселение гостя
        hotel.checkIn(101, "Иванов И.И.");

        // Попытка заселить в занятый номер
        hotel.checkIn(101, "Петров П.П.");

        // Выселение гостя
        hotel.checkOut(101);

        // Изменение статуса номера
        hotel.setRoomStatus(102, RoomStatus.REPAIR);

        // Изменение цены номера
        hotel.setRoomPrice(102, 2000);

        // Изменение цены услуги
        hotel.setServicePrice("Wi-Fi", 150);

        // Добавление нового номера и услуги
        hotel.addRoom(new Room(103, 1700));
        hotel.addService(new Service("Парковка", 250));
    }
}

