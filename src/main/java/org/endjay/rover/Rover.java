package org.endjay.rover;

/**
 * Created by gustiamanda on 9/26/16.
 */
public class Rover {

    public static final Integer maxX  = 5;
    public  static final Integer maxY =  5;

    public Integer  x  = 0;
    public  Integer y = 0;

    public String direction = "N";

    public void main(String[] args){
        setRoverPosition(1,2,1);
    }


    public void setRoverPosition(Integer x, Integer y, Integer facing)  {
        if(facing == 1 ){
            this.direction = "N";
        }else if( facing == 2){
            this.direction = "S";
        }else if(facing == 3 ){
            this.direction = "E";
        }else if( facing == 4){
            this.direction = "w";
        }

        this.x = x;
        this.y = y;
    }

    public void turn(String command){
        String currentDirection = this.direction;

        if(currentDirection == "N" && command == "L"){
            this.direction = "W";
        }else if(currentDirection == "N" && command == "R"){
            this.direction = "E";
        }else if(currentDirection == "E" && command == "L"){
            this.direction = "N";
        }else if(currentDirection == "E" && command == "R"){
            this.direction = "S";
        }else if(currentDirection == "S" && command == "L"){
            this.direction = "E";
        }else if(currentDirection == "S" && command == "R"){
            this.direction = "W";
        }else if(currentDirection == "W" && command == "L"){
            this.direction = "S";
        }else if(currentDirection == "W" && command == "R"){
            this.direction = "N";
        }
    }

    



}
