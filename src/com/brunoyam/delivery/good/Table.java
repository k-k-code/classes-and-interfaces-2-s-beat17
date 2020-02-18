package com.brunoyam.delivery.good;

public class Table extends AbstractFurniture {
    /**
     * @param price                Стоимость.
     * @param weight               Вес.
     * @param numberOfUnitsPackage Количество штук в упаковке.
     */
    protected Table(short price, short weight, short numberOfUnitsPackage) {
        super(price, weight, numberOfUnitsPackage);
    }
}
