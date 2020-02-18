package com.brunoyam.delivery.storage;

import com.brunoyam.delivery.Communication;

public class Retail implements Communication {

    /**
     * Общее количество мест хранения.
      */
    private short storagePlace;

    /**
     *
     * @param storagePlace Общее количество мест хранения.
     */
    protected Retail(short storagePlace) {
        this.storagePlace = storagePlace;

    }

    public short getStoragePlace() {
        return storagePlace;
    }

    @Override
    public void getCommunication(boolean resolution) {

    }
}
