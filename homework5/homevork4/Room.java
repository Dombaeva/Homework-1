package dmdew.oop.homevork4;

public class Room {
    boolean passage;

    public Room(boolean passage) {
        this.passage = passage;
    }

    void print() {
        System.out.println("Комната проходная: " + ((passage == true) ? "да" : "нет"));
    }
}
