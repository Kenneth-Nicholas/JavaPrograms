package com.kennethnicholas;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;

    }

    public void loadProgram(String programName) {

        System.out.println("Program " + programName + " is now loading...");

    }

    public String getModel() {

        return this.model;

    }

    public String getManufacturer() {

        return this.manufacturer;

    }

    public int getRamSlots() {

        return this.ramSlots;

    }

    public int getCardSlots() {

        return this.cardSlots;

    }

    public String getBios() {

        return this.bios;

    }

}
