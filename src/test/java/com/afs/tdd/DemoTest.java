package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_1_when_direction_given_N() {
        Rover rover = new Rover(0, 0, "N");
        rover.controlMarsRover("M");

        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getDirection());


    }

    @Test
    public void should_return_y_minus_one_when_direction_given_S() {
        //given
        Rover rover = new Rover(0, 0, "S");


        //when
        rover.controlMarsRover("M");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getDirection());

    }
    @Test
    public void should_return_x_plus_one_when_direction_given_E() {
        //given

        Rover rover = new Rover(0,0,"E");
        //when
        rover.controlMarsRover("M");


        //then
        assertEquals(1,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("E",rover.getDirection());

    }
    @Test
    public void should_reutrn_x_minus_one_when_direction_given_W() {
        //given
        Rover rover = new Rover(0,0,"W");

        //when
        rover.controlMarsRover("M");

        //then
        assertEquals(-1,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }
    @Test
    public void should_return_W_when_direction_given_N_Commands_L() {
        //given
        Rover rover = new Rover(0,0,"N");

                
        //when
        rover.controlMarsRover("L");
        
        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("W",rover.getDirection());
    }
    @Test
    public void should_return_E_when_direction_given_S_Commands_L() {
        //given
        Rover rover = new Rover(0,0,"S");

        //when
        rover.controlMarsRover("L");

        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("E",rover.getDirection());
    }
    @Test
    public void should_return_N_when_direction_given_E_Commands_L() {
        //given
        Rover rover = new Rover(0,0,"E");


        //when
        rover.controlMarsRover("L");

        //then
        assertEquals(0,rover.getLocationX());
        assertEquals(0,rover.getLocationY());
        assertEquals("N",rover.getDirection());
    }


    



}
