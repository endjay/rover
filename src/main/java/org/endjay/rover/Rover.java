package org.endjay.rover;

import java.util.Scanner;
/**
 * Created by gustiamanda on 9/26/16.
 */
public class Rover {


    public static Integer  xAxis  = 0;
    public  static Integer yAxis = 0;

    public  static String direction = "N";

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Plateu limit : ");
        Integer xLimit = reader.nextInt();
        Integer yLimit = reader.nextInt();
        System.out.format("%d and %d",xLimit,yLimit);

        //Rover.setRoverPosition(1,2,1);
        //Rover.turn("L");
        //System.out.format("The value of i is: %d,%d,%s", xAxis,yAxis,direction);

    }



    public static void setRoverPosition(Integer x, Integer y, Integer facing)  {

        if(facing == 1 ){
            direction = "N";
        }else if( facing == 2){
            direction = "S";
        }else if(facing == 3 ){
            direction = "E";
        }else if( facing == 4){
            direction = "W";
        }

        xAxis = x;
        yAxis = y;
    }

    public static void turn(String command){
        String currentDirection = direction;

        if(currentDirection == "N" && command == "L"){
            direction = "W";
        }else if(currentDirection == "N" && command == "R"){
            direction = "E";
        }else if(currentDirection == "E" && command == "L"){
            direction = "N";
        }else if(currentDirection == "E" && command == "R"){
            direction = "S";
        }else if(currentDirection == "S" && command == "L"){
            direction = "E";
        }else if(currentDirection == "S" && command == "R"){
            direction = "W";
        }else if(currentDirection == "W" && command == "L"){
            direction = "S";
        }else if(currentDirection == "W" && command == "R"){
            direction = "N";
        }
    }

    public void move(){
        Integer currentX = xAxis;
        Integer currentY = yAxis;

        if(this.direction == "N"){
            yAxis += 1;
        }else if(this.direction == "S"){
            yAxis -= 1;
        }else if(this.direction == "E"){
            xAxis += 1;

        }else if(this.direction == "W"){
            xAxis -= 1;
        }

    }



}
