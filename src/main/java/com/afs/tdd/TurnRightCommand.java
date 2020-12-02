package com.afs.tdd;

public class TurnRightCommand implements Command{


    @Override
    public void execute(Rover rover) {
        rover.turnRight(rover.getDirection());
    }
}
