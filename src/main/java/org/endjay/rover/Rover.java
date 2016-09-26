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


        System.out.format("Rover Current Position is : %d %d %s ", rover.xAxis,rover.yAxis,rover.direction);

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

        for (String s: splitedCommand)
        {
            if(s.equals("L") || s.equals("R") ){
                turn(s);
            }else if(s.equals("M")){
                move();
            }
        }

    }

    public void turn(String command){
        String currentDirection = direction;

        if(currentDirection.equals("N") && command.equals("L")){
            direction = "W";
        }else if(currentDirection.equals("N") && command.equals("R")){
            direction = "E";
        }else if(currentDirection.equals("E") && command.equals("L")){
            direction = "N";
        }else if(currentDirection.equals("E") && command.equals("R")){
            direction = "S";
        }else if(currentDirection.equals("S") && command.equals("L")){
            direction = "E";
        }else if(currentDirection.equals("S") && command.equals("R")){
            direction = "W";
        }else if(currentDirection.equals("W") && command.equals("L")){
            direction = "S";
        }else if(currentDirection.equals("W") && command.equals("R")){
            direction = "N";
        }

    }

    public void move(){

        if(direction.equals("N")){
            yAxis = yAxis + 1;
        }else if(direction.equals("S")){
            yAxis = yAxis - 1;
        }else if(direction.equals("E")){
            xAxis = xAxis + 1;
        }else if(direction.equals("W")){
            xAxis = xAxis - 1;
        }



    }



}
