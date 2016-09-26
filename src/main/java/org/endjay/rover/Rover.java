package org.endjay.rover;

import java.util.Scanner;
/**
 * Created by gustiamanda on 9/26/16.
 */
public class Rover {


    public  static  Integer xLimit = 0;
    public  static Integer yLimit = 0;

    public static Integer  xAxis  = 0;
    public  static Integer yAxis = 0;

    public  static String direction = "N";

    public static void main(String[] args){
        Rover rover = new Rover();
        rover.setPLateuLimit();
        rover.setRoverPosition();
        rover.setRoverCommand();


        System.out.format("The value of i is: %d,%d,%s", rover.xAxis,rover.yAxis,rover.direction);

    }


    public void setPLateuLimit(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Plateu limit : ");
        xLimit = reader.nextInt();
        yLimit = reader.nextInt();
    }

    public  void setRoverPosition()  {
        Scanner reader = new Scanner(System.in);
        System.out.println("Set Rover Launch Position : ");
        xAxis = reader.nextInt();
        yAxis = reader.nextInt();
        direction = reader.next();

    }

    public   void setRoverCommand (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Upload Command: ");
        String command = reader.next();
        String[] splitedCommand = command.split("");
        for (int i=0; i<splitedCommand.length; i++)
        {
            if(splitedCommand[i] == "L"){
                turn(splitedCommand[i]);
            }else if(splitedCommand[i] == "M"){
                move();
            }
        }


    }

    public  void turn(String command){
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

    public  void move(){

        if(direction == "N"){
            yAxis += 1;
        }else if(direction == "S"){
            yAxis -= 1;
        }else if(direction == "E"){
            xAxis += 1;

        }else if(direction == "W"){
            xAxis -= 1;
        }

    }



}
