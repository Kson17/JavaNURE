package com.nure;

public class Main {

    public static void main(String[] args) {
        int[] array = {-2, -8, 3, 4, 0, 10, -90, 0, 292};
        SortArrayAndPrint.call(array);

        Rectangle rectangle1 = new Rectangle(120, 180, "rectangle 1");
        Rectangle rectangle2 = new Rectangle(120, 190, "rectangle 2");

        System.out.println(String.valueOf(rectangle1.perimeter()));
        Rectangle.compareAreasAndPrint(rectangle1, rectangle2);

        Car car = new Car(5, 120, "Opel", 180, 2000, 4);
        Truck truck = new Truck(true, 4000, 2.4, "Scania", 140, 3000, 2);

        System.out.println(String.valueOf(car.engine_power));
        System.out.println(String.valueOf(truck.has_trailer));
    }
}
