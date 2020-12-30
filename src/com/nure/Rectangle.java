package com.nure;

// Задание 9 из списка задач к занятию 4
// Опишите класс прямоугольников. Задайте функцию, определяющую, площадь какого прямоугольника из двух больше.
// Задайте функцию вычисления периметра прямоугольника.

public class Rectangle {
    int height;
    int width;
    String name;

    public Rectangle (int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public int perimeter() {
        return 2 * (height + width);
    }

    public int area() {
        return height * width;
    }

    public static void compareAreasAndPrint(Rectangle rect1, Rectangle rect2) {
      if (rect1.area() > rect2.area()) {
          System.out.println("Площадь " + rect1.name + " больше чем площадь " + rect2.name);
      } else if (rect2.area() > rect1.area()) {
          System.out.println("Площадь " + rect2.name + " больше чем площадь " + rect1.name);
      } else {
          System.out.println("Площади обоих прямоугольников идентичны");
      }
    }
}
