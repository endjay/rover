package org.endjay.rover;

/**
 * Created by gustiamanda on 9/26/16.
 */
public class Rover {


    public void main(String[] args){

    }
    public String position (Integer x, Integer y, Integer facing ){
        String direction = "N";

        if(facing == 1 ){
            direction = "N";
        }else if( facing == 2){
            direction = "S";
        }else if(facing == 3 ){
            direction = "E";
        }else if( facing == 4){
            direction = "w";
        }

        String xAxis = x.toString();
        String yAxis = y.toString();

        return xAxis+" "+ yAxis +" "+direction;
    }
}
