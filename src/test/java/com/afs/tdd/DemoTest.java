package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_1_when_command_is_M_given_0_0_N() {
        //given
        Rover rover = new Rover(0, 0, "N");
        String command = "M";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();

        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getDirection());


    }

    @Test
    public void should_return_y_minus_one_when_command_is_M_given_0_0_S() {
        //given
        Rover rover = new Rover(0, 0, "S");
        String command = "M";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getDirection());

    }
    @Test
    public void should_return_x_plus_one_when_command_is_M_given_0_0_E() {
        //given

        Rover rover = new Rover(0,0,"E");
        String command = "M";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then
        assertEquals(1,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("E",rover.getDirection());

    }
    @Test
    public void should_reutrn_x_minus_one_when_command_is_M_given_0_0_W() {
        //given
        Rover rover = new Rover(0,0,"W");
        String command = "M";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();

        //then
        assertEquals(-1,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }
    @Test
    public void should_return_W_when_command_is_L_given_0_0_N() {
        //given
        Rover rover = new Rover(0,0,"N");
        String command = "L";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }
    @Test
    public void should_return_E_when_command_is_L_given_0_0_S() {
        //given
        Rover rover = new Rover(0,0,"S");
        String command = "L";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("E",rover.getDirection());
    }
    @Test
    public void should_return_N_when_command_is_L_given_0_0_E() {
        //given
        Rover rover = new Rover(0,0,"E");
        String command = "L";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("N",rover.getDirection());
    }
    @Test
    public void should_return_S_when_command_is_L_given_0_0_W() {
        //given
        Rover rover = new Rover(0,0,"W");
        String command = "L";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();

        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("S",rover.getDirection());
    }
    @Test
    public void should_return_E_when_command_is_R_given_0_0_N() {
        //given
        Rover rover = new Rover(0,0,"N");
        String command = "R";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("E",rover.getDirection());
    }
    @Test
    public void should_return_S_when_command_is_R_given_0_0_E() {
        //given
        Rover rover = new Rover(0,0,"E");
        String command = "R";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("S",rover.getDirection());
    }
    @Test
    public void should_return_W_when_command_is_R_given_0_0_S() {
        //given
        Rover rover = new Rover(0,0,"S");
        String command = "R";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }
    @Test
    public void should_return_N_when_command_is_R_given_0_0_W() {
        //given
        Rover rover = new Rover(0,0,"W");
        String command = "R";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();
        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("N",rover.getDirection());
    }
    @Test
    public void should_return_expected_Location_when_given_some_commands() {
        //given
        Rover rover = new Rover(0,0,"W");
        String command = "RMLLMMR";
        Instruction instruction = new Instruction(rover);
        //when
        instruction.handleInstruction(command);
        instruction.controlRover();

        //then

        assertEquals(0,rover.getLocationX());
        assertEquals(-1,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }


    



}
