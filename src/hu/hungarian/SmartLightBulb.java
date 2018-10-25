package hu.hungarian;

import javafx.scene.paint.Color;

import java.sql.Time;

public class SmartLightBulb {

    private short lightPercent = 0;
    private Color color = Color.PINK;

    public SmartLightBulb(){

        lightPercent=50;
        color = Color.WHITESMOKE;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setLightPercent(short lightPercent) {
        this.lightPercent = lightPercent;
    }

    public short getLightPercent() {
        return lightPercent;
    }

    public void turnUp(){

        if(lightPercent<=80){
        lightPercent+=20;}
        else lightPercent=100;
    }

    public void turnDown(){

        if (lightPercent>=20){
            lightPercent-=20;}
            lightPercent=0;
    }

public String toString(){
        String power;
        if (lightPercent >0){
            power = "tændt";}
            else power="slukket";

            String status="pæren er " + power + " på " + lightPercent + " procent og farven er " + color ;
            return status;
        }
}


