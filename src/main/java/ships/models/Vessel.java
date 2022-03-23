package main.java.ships.models;

import main.java.ships.interfaces.Damager;
import main.java.ships.interfaces.Sailable;

import java.awt.*;

public class Vessel {
    Point[] points = new Point[8];
    Damager damager;

    Sailable sail;
    public void attack(){
        damager.damage();
    }
}
