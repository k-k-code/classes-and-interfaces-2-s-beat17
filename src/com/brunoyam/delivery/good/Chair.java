package com.brunoyam.delivery.good;

public class Chair extends AbstractFurniture {
    /**
     * @param price                Стоимость.
     * @param weight               Вес.
     * @param numberOfUnitsPackage Количество штук в упаковке.
     */
    protected Chair(short price, short weight, short numberOfUnitsPackage) {
        super(price, weight, numberOfUnitsPackage);
    }
}
