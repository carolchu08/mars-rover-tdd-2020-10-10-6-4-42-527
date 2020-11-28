package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instruction{
    private static final String MOVE_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private final List<Command> instructions = new ArrayList<>();
    private Rover rover;

    public Instruction(Rover rover) {
       this.rover =  rover;
    }

    public void handleInstruction(String commands) {
        Arrays.asList(commands.split("")).
                forEach(command -> {
                    if (command.equals(MOVE_COMMAND)) {
                        instructions.add(new MoveForwardsCommand(rover));
                    } else if (command.equals(TURN_LEFT_COMMAND)) {
                        instructions.add(new TurnLeftCommand(rover));
                    } else {
                        instructions.add(new TurnRightCommand(rover));
                    }
                });
    }

    public void controlRover() {
        instructions.forEach(instruction -> instruction.execute(rover));
        instructions.clear();
    }
}
