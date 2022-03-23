package main.java.players.models;

import main.java.players.interfaces.Player;
import main.java.ships.models.Vessel;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Vessel> vesselsUser = new ArrayList<Vessel>();

    public void getReadyForGame(){

    }
    public boolean isReadyToPlay(){
        return false;
    }
    public void getVessels(){

    }
}
