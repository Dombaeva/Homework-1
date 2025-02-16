package dmdew.oop.homevork4;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах,
 * квартирах и комнатах, вызывая методы print.
 */
public class Runner {
    public static void main(String[] args) {


        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room[] rooms = {room1, room2};

        Flat flat1 = new Flat(1, rooms);
        Flat flat2 = new Flat(2, rooms);
        Flat[] flats = {flat1, flat2};

        Floor floor1 = new Floor(1, flats);
        Floor[] floors = {floor1};

        House house = new House(1, floors);

printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
    }

}
