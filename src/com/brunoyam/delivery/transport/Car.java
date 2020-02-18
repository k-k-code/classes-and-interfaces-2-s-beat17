package com.brunoyam.delivery.transport;

public class Car extends AbstractTransport {
    /**
     * @param carrying  Грузоподьемность.
     * @param speed     Скорость.
     * @param costOneKm Стоимость одного км пути.
     */
    protected Car(short carrying, short speed, short costOneKm) {
        super(carrying, speed, costOneKm);
    }
}
