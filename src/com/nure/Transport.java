package com.nure;

public class Transport {
    public String mark;
    int max_speed;
    int capacity;
    int passenger_seats;

    public Transport (String mark, Integer max_speed, Integer capacity, Integer passenger_seats) {
      this.mark = mark;
      this.max_speed = max_speed;
      this.capacity = capacity;
      this.passenger_seats = passenger_seats;
    }
}
