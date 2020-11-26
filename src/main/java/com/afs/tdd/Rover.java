package com.afs.tdd;

import javax.naming.ldap.Control;

public class Rover {
    public static final String W = "W";
    public static final String E = "E";
    public static final String S = "S";
    public static final String N = "N";
    public static final String M = "M";
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
        if (commands.equals(M)) {
            this.moverForwards(this.direction);
        }else if(commands.equals("L")){
            this.turnLeft(this.direction);
        }
    }

    private void turnLeft(String rotationCommands) {
        switch(rotationCommands){
            case N:
                this.direction = W;
                break;
        }
    }

    private void moverForwards(String direction) {
        switch (direction) {
            case N:
                this.locationY += 1;
                break;
            case S:
                this.locationY -= 1;
                break;
            case E:
                this.locationX += 1;
                break;
            case W:
                this.locationX -= 1;
                break;
        }

    }

}
