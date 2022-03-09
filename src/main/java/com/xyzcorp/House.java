package com.xyzcorp;

public class House{
    //member variables
    private int squareFoot;
    private boolean hasSolar;
    private int numberGarages;

    public House(int squareFoot, boolean hasSolar, int numberGarages) {
        this.squareFoot = squareFoot;
        this.hasSolar = hasSolar;
        this.numberGarages = numberGarages;
    }
    public int getSquareFoot() {
        return squareFoot;
    }

    public boolean hasSolar() {
        return hasSolar;
    }

    public int getNumberGarages() {
        return numberGarages;
    }
}



