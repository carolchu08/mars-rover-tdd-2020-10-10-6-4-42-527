package com.afs.tdd;

public class MoveForwardsCommand implements Command{
    private Rover rover;

    public MoveForwardsCommand(Rover rover) {
        this.rover = rover;


    }

    @Override
    public void execute(Rover rover) {
        rover.moveForwards(rover.getDirection());
    }
}
