package com.brunoyam.delivery.transport;

public class Ship extends AbstractTransport {
    /**
     * @param carrying  Грузоподьемность.
     * @param speed     Скорость.
     * @param costOneKm Стоимость одного км пути.
     */
    protected Ship(short carrying, short speed, short costOneKm) {
        super(carrying, speed, costOneKm);
    }
}
