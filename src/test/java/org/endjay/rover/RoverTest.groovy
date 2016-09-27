package org.endjay.rover

/**
 * Created by gustiamanda on 9/26/16.
 */
class RoverTest extends GroovyTestCase {

    void testTurnLeft(){
        Rover rover = new Rover();
        rover.turn("L");
        assertEquals(rover.direction,"W");
    }

    void testTurnRight(){
        Rover rover = new Rover();
        rover.turn("R");
        assertEquals(rover.direction,"E");
    }

    void testMoveForward(){
        Rover rover = new Rover();
        System.out.println(rover.yAxis);
        rover.move();
        assertEquals(rover.yAxis,1);
    }

    void testMoveBackward(){
        Rover rover = new Rover();
        rover.yAxis = 3;
        rover.direction = "S";
        System.out.println(rover.yAxis);
        rover.move();
        assertEquals(rover.yAxis,2);
    }





}
