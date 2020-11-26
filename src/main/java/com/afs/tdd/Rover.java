package com.afs.tdd;

import javax.naming.ldap.Control;

public class Rover {
    private int locationX;
    private int locationY;
    private String direction;


    public Rover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void controlMarsRover(String commands) {
        if (commands.equals("M")) {
            this.moverForwards(this.direction);
        }
    }

    private void moverForwards(String direction) {
        switch (direction) {
            case "N":
                locationY += 1;
                break;
            case "S":
                locationY -= 1;
                break;
            case "E" :
                locationX += 1;
            case "W" :
                locationX -= 1;
        }

    }
}
