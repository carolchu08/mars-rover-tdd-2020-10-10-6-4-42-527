package com.afs.tdd;

public class TurnLeftCommand implements Command{

    @Override
    public void execute(Rover rover) {
        rover.turnLeft(rover.getDirection());
    }
}
