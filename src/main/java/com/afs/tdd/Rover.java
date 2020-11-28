package com.afs.tdd;

import java.util.Arrays;

public class Rover {
    private static final String WEST_DIRECTION = "W";
    private static final String EAST_DIRECTION = "E";
    private static final String SOUTH_DIRECTION = "S";
    private static final String NORTH_DIRECTION = "N";
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


    public void turnRight(String rotationCommands) {
        switch ((rotationCommands)) {
            case NORTH_DIRECTION:
                this.direction = EAST_DIRECTION;
                break;
            case EAST_DIRECTION:
                this.direction = SOUTH_DIRECTION;
                break;
            case SOUTH_DIRECTION:
                this.direction = WEST_DIRECTION;
                break;
            case WEST_DIRECTION:
                this.direction = NORTH_DIRECTION;
                break;
        }
    }

    public void turnLeft(String rotationCommands) {
        switch (rotationCommands) {
            case NORTH_DIRECTION:
                this.direction = WEST_DIRECTION;
                break;
            case SOUTH_DIRECTION:
                this.direction = EAST_DIRECTION;
                break;
            case EAST_DIRECTION:
                this.direction = NORTH_DIRECTION;
                break;
            case WEST_DIRECTION:
                this.direction = SOUTH_DIRECTION;
                break;
        }
    }

    public void moveForwards(String direction) {
        switch (direction) {
            case NORTH_DIRECTION:
                this.locationY += 1;
                break;
            case SOUTH_DIRECTION:
                this.locationY -= 1;
                break;
            case EAST_DIRECTION:
                this.locationX += 1;
                break;
            case WEST_DIRECTION:
                this.locationX -= 1;
                break;
        }

    }
}
