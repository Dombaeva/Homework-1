package dmdew.oop.homevork4;

public class House {
    int numberHouse;
    Floor[] floors;

    House(int numberHouse, Floor[] floors){
        this.numberHouse = numberHouse;
        this.floors = floors;
    }

   void print(){
        System.out.println("Дом номер " + numberHouse + ", этаж " + floors.length);
       for (Floor floor : floors) {
           floor.print();
       }
    }
}


