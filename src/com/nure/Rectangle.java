package com.nure;

// Задание 9 из списка задач к занятию 4
public class Rectangle {
    public int height;
    public int width;
    public String name;

    public Rectangle (int h, int w, String n) {
        height = h;
        width = w;
        name = n;
    }

    public int perimeter() {
        return 2 * (height + width);
    }

    public int area() {
        return height * width;
    }

    public static void compareAreas(Rectangle rect1, Rectangle rect2) {
      if (rect1.area() > rect2.area()) {
          System.out.println("Площадь " + rect1.name + " больше чем площадь " + rect2.name);
      } else if (rect2.area() > rect1.area()) {
          System.out.println("Площадь " + rect2.name + " больше чем площадь " + rect1.name);
      } else {
          System.out.println("Площади обоих прямоугольников идентичны");
      }
    }
}
