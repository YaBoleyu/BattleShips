package main.java.ships.models;

import main.java.ships.interfaces.Damager;
import main.java.ships.interfaces.Sailable;

import java.awt.*;

public class Vessel {
    Point[] amountOfDecks;
    Point[] points = new Point[8];
    Damager damager;

    public Vessel(int amountOfDecks){
        if (amountOfDecks > 3){
            this.amountOfDecks = new Point[amountOfDecks];
        }
        else System.out.println("test");
    }
    Sailable sail;
    public void attack(){
        damager.damage();
    }
    public int lengthOfDecks(){
        return amountOfDecks.length;
    }
}
