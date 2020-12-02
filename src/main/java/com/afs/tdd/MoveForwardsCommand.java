package com.afs.tdd;

public class MoveForwardsCommand implements Command{


    @Override
    public void execute(Rover rover) {
        rover.moveForwards(rover.getDirection());
    }
}
