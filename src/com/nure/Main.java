package com.nure;

public class Main {

    public static void main(String[] args) {
        int[] array = {-2, -8, 3, 4, 0, 10, -90, 0, 292};
        SortArrayAndPrint.call(array);

        Rectangle rectangle1 = new Rectangle(120, 180, "rectangle 1");
        Rectangle rectangle2 = new Rectangle(120, 190, "rectangle 2");

        System.out.println(String.valueOf(rectangle1.perimeter()));
        Rectangle.compareAreas(rectangle1, rectangle2);
    }
}
