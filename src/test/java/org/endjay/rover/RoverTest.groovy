package org.endjay.rover

/**
 * Created by gustiamanda on 9/26/16.
 */
class RoverTest extends GroovyTestCase {

    void testMain() {

    }

    void  TestrunRover(){

    }

    void testSetRoverPosition() {
        Rover.position(5,5,1);
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

    void testCurrentPosition(){

    }



}
