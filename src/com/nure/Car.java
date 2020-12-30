package com.nure;

public class Car extends Transport {
    int number_of_doors;
    int engine_power;

    public Car (int number_of_doors,
                int engine_power,
                String mark,
                int max_speed,
                int capacity,
                int passenger_seats) {
        super(mark, capacity, passenger_seats, max_speed);
        this.number_of_doors = number_of_doors;
        this.engine_power = engine_power;
    }
}
