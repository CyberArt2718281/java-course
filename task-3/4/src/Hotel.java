import types.RoomStatus;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Service> services = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Добавлен номер: " + room.getNumber());
    }

    public void addService(Service service) {
        services.add(service);
        System.out.println("Добавлена услуга: " + service.getName());
    }

    public void checkIn(int roomNumber, String guest) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber && room.getStatus() == RoomStatus.FREE) {
                room.setGuest(guest);
                room.setStatus(RoomStatus.OCCUPIED);
                System.out.println("Гость " + guest + " заселен в номер " + roomNumber);
                return;
            }
        }
        System.out.println("Номер недоступен для заселения: " + roomNumber);
    }

    public void checkOut(int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber && room.getStatus() == RoomStatus.OCCUPIED) {
                System.out.println("Гость " + room.getGuest() + " выселен из номера " + roomNumber);
                room.removeGuest();
                room.setStatus(RoomStatus.FREE);
                return;
            }
        }
        System.out.println("Номер не занят: " + roomNumber);
    }

    public void setRoomStatus(int roomNumber, RoomStatus status) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                if (room.getStatus() == status) {
                    System.out.println("Статус номера " + roomNumber + " уже установлен: " + status.getDisplayName());
                    return;
                }
                room.setStatus(status);
                System.out.println("Статус номера " + roomNumber + " изменен на " + status.getDisplayName());
                return;
            }
        }
        System.out.println("Номер не найден: " + roomNumber);
    }

    public void setRoomPrice(int roomNumber, double price) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                double oldPrice = room.getPrice();
                room.setPrice(price);
                String direction = oldPrice == price ? "(без изменений)" : (price > oldPrice ? "(увеличена)" : "(уменьшена)");
                System.out.println("Цена номера " + roomNumber + " изменена: " + oldPrice + " -> " + price + " " + direction);
                return;
            }
        }
        System.out.println("Номер не найден: " + roomNumber);
    }

    public void setServicePrice(String serviceName, double price) {
        for (Service service : services) {
            if (service.getName().equals(serviceName)) {
                double oldPrice = service.getPrice();
                service.setPrice(price);
                String direction = oldPrice == price ? "(без изменений)" : (price > oldPrice ? "(увеличена)" : "(уменьшена)");
                System.out.println("Цена услуги " + serviceName + " изменена: " + oldPrice + " -> " + price + " " + direction);
                return;
            }
        }
        System.out.println("Услуга не найдена: " + serviceName);
    }
}
