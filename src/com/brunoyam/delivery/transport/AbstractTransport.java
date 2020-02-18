package com.brunoyam.delivery.transport;

public abstract class AbstractTransport {

    /**
     * Грузоподьемность.
     */
    private short carrying;

    /**
     * Скорость.
     */
    private short speed;

    /**
     * Стоимость одного км пути.
     */
    private short costOneKm;

    /**
     * @param carrying  Грузоподьемность.
     * @param speed     Скорость.
     * @param costOneKm Стоимость одного км пути.
     */
    protected AbstractTransport(short carrying, short speed, short costOneKm) {
        this.carrying = carrying;
        this.speed = speed;
        this.costOneKm = costOneKm;
    }

    public short getCarrying() {
        return carrying;
    }

    public void setCarrying(short carrying) {
        this.carrying = carrying;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getCostOneKm() {
        return costOneKm;
    }

    public void setCostOneKm(short costOneKm) {
        this.costOneKm = costOneKm;
    }
}
