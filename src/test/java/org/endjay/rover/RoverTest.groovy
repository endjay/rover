package org.endjay.rover

/**
 * Created by gustiamanda on 9/26/16.
 */
class RoverTest extends GroovyTestCase {

    void testMain() {

    }

    void testPosition() {
        String roverPosition = Rover.position(5,5);
        System.out.println(roverPosition);
        assertEquals('5 5 N',roverPosition);
    }

    void setPlateu(){
        Integer maxX = Rover.maxX;
        Integer maxY = Rover.maxY;
        assertEquals(maxX,5);
        assertEquals(maxY,5);

    }
}
