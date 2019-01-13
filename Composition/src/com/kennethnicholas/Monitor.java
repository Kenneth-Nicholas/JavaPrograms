/*This is an early example of composition.
* The resolution class is part of a monitor.
* The monitor isn't a resolution, but it has a resolution.
* The resolution is part of a monitor or a component of the monitor.
* The monitor has a resolution which is the native resolution*/
package com.kennethnicholas;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }

    public void drawPixelAt(int x, int y, String color) {

        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);

    }

}
