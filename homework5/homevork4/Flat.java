package dmdew.oop.homevork4;

import java.util.Arrays;

public class Flat {
    int numberFlat;
    Room[] rooms;

    public Flat(int numberFlat, Room[] room) {
        this.numberFlat = numberFlat;
        this.rooms = room;
    }
   void print(){
        System.out.println("Номер квартиры " + numberFlat+ ", количество комнат " + rooms.length);
       for (Room room : rooms) {
           room.print();
       }
    }


}
