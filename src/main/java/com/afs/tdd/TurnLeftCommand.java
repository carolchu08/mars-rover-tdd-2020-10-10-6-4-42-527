package com.afs.tdd;

public class TurnLeftCommand implements Command{

    private Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute(Rover rover) {
        rover.turnLeft(rover.getDirection());
    }
}
