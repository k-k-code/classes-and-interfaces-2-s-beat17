package com.brunoyam.delivery.good;

public abstract class AbstractFurniture {
    /**
     * Стоимость.
     */
    private short price;

    /**
     * Вес.
     */
    private short weight;

    /**
     * Количество штук в упаковке.
     */
    private short numberOfUnitsPackage;

    /**
     * @param price                Стоимость.
     * @param weight               Вес.
     * @param numberOfUnitsPackage Количество штук в упаковке.
     */
    protected AbstractFurniture(short price, short weight, short numberOfUnitsPackage) {
        this.price = price;
        this.weight = weight;
        this.numberOfUnitsPackage = numberOfUnitsPackage;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public short getNumberOfUnitsPackage() {
        return numberOfUnitsPackage;
    }

    public void setNumberOfUnitsPackage(short numberOfUnitsPackage) {
        this.numberOfUnitsPackage = numberOfUnitsPackage;
    }
}
