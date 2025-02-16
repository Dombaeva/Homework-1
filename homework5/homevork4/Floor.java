package dmdew.oop.homevork4;

import java.util.Arrays;

public class Floor {
    int numberFloor;
    Flat[] flats;

    Floor(int numberFloor, Flat[] flats){
        this.numberFloor = numberFloor;
        this.flats = flats;
    }
    void print(){
        System.out.println("Этаж " + numberFloor + ", количество квартир " + flats.length);
        for (Flat flat : flats) {
            flat.print();
        }
    }
}
