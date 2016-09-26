package org.endjay.rover;

/**
 * Created by gustiamanda on 9/26/16.
 */
public class Rover {

    public static final Integer maxX  = 5;
    public  static final Integer maxY =  5;

    public void main(String[] args){

    }
    public String position (Integer x, Integer y, Integer facing ) throws  Exception {
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

        System.out.println(direction);
        String xAxis = x.toString();
        String yAxis = y.toString();

        return xAxis+" "+ yAxis +" "+direction;
    }
}
