package com.brunoyam.delivery;

/**
 * Интерфейс определяющий связь со складом
 */
public interface Communication {

    /**
     * Метод обрабатывает разрешение на вид транспорта.
     *
     * @param resolution разрешение для транспорта.
     */
    void getCommunication(boolean resolution);

}
