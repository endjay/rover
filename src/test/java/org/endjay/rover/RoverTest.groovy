package org.endjay.rover

/**
 * Created by gustiamanda on 9/26/16.
 */
class RoverTest extends GroovyTestCase {

    void testMain() {

    }

    void  TestrunRover(){

    }

    void testPosition() {
        String roverPosition = Rover.position(5,5);
        assertEquals('5 5 N',roverPosition);
    }

    void testSetPlateu(){
        Integer maxX = Rover.maxX;
        Integer maxY = Rover.maxY;
        assertEquals(maxX,5);
        assertEquals(maxY,5);

    }

    void testTurnLeft(){

    }

    void testTurnRight(){

    }

    void testMoveForward(){

    }



}
