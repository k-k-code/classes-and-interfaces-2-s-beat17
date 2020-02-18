package com.brunoyam.delivery.good;

public class Cupboard extends AbstractFurniture {
    /**
     * @param price                Стоимость.
     * @param weight               Вес.
     * @param numberOfUnitsPackage Количество штук в упаковке.
     */
    protected Cupboard(short price, short weight, short numberOfUnitsPackage) {
        super(price, weight, numberOfUnitsPackage);
    }
}
