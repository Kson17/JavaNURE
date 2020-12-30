package com.nure;

public class Truck extends Transport {
    boolean has_trailer;
    int trailer_capacity;
    double height;

    public Truck (
            boolean has_trailer,
            int trailer_capacity,
            double height,
            String mark,
            int max_speed,
            int capacity,
            int passenger_seats) {
        super(mark, capacity, passenger_seats, max_speed);
        this.has_trailer = has_trailer;
        this.trailer_capacity = trailer_capacity;
        this.height = height;
    }
}
