package main.java.players.interfaces;
import main.java.ships.models.Vessel;
import java.util.List;

public interface Player {
    void getReadyForGame();
    List <Vessel> getVessel();
    Boolean isReadyToPlay();
}

