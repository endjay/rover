package org.endjay.rover

/**
 * Created by gustiamanda on 9/26/16.
 */
class RoverTest extends GroovyTestCase {
    void testMain() {

    }

    void testPosition() {
        String roverPosition = Rover.position(5,5,1);
        System.out.println(roverPosition);
        assertEquals('5 5 N',roverPosition);
    }
}
