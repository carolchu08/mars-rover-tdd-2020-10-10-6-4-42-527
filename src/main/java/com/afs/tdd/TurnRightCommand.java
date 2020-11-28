package com.afs.tdd;

public class TurnRightCommand implements Command{
    private Rover rover;

    public TurnRightCommand(Rover rover) {
        this.rover = rover;

    }

    @Override
    public void execute(Rover rover) {
        rover.turnRight(rover.getDirection());
    }
}
