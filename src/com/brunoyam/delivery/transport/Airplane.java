package com.brunoyam.delivery.transport;

public class Airplane extends AbstractTransport {
    /**
     * @param carrying  Грузоподьемность.
     * @param speed     Скорость.
     * @param costOneKm Стоимость одного км пути.
     */
    protected Airplane(short carrying, short speed, short costOneKm) {
        super(carrying, speed, costOneKm);
    }
}
