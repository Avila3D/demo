/**
 * @author Antonio Avila
 * CS 115 Assignment 2
 */

import java.util.ArrayList;
import java.util.List;

public class ConnFourPlayer {

    private String playerValueOf = "0";
    private String playerColor = "";

    //constructor

    public ConnFourPlayer(String playerValueOf, String playerColor) {

        this.playerValueOf = playerValueOf;
        this.playerColor = playerColor;

    }

    ConnFourChip chip = new ConnFourChip(playerValueOf, playerColor); // instance of chip
    List <ConnFourChip> chipSet = new ArrayList (21); // chip set list

    public boolean PlayChip() {
        if(chipSet.isEmpty()) {
            System.out.println("You are out of chips");
        } else {
            chipSet.remove(0);
            System.out.println("You have " + chipSet.size() + " left to play");
            return true;
        }
        return false;
    }
} // end of ConnFourPlayer class
