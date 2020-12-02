package com.afs.tdd;


public class Rover {
    private static final String WEST = "W";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String NORTH = "N";
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
            case NORTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = NORTH;
                break;
        }
    }

    public void turnLeft(String rotationCommands) {
        switch (rotationCommands) {
            case NORTH:
                this.direction = WEST;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = NORTH;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
        }
    }

    public void moveForwards(String direction) {
        switch (direction) {
            case NORTH:
                this.locationY += 1;
                break;
            case SOUTH:
                this.locationY -= 1;
                break;
            case EAST:
                this.locationX += 1;
                break;
            case WEST:
                this.locationX -= 1;
                break;
        }

    }
}
