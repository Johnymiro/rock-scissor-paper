package org.academiadecodigo.stringrays;

public class Player {

    private String name;

    private int numOfWins = 0;

    public Player(String name){

        this.name = name;
    }



    public Hand playerHand(){

        return Hand.handGenerator();
    }



    public String getName(){

        return this.name;
    }

    public int getNumOfWins(){

        return numOfWins;
    }

    public void incrementNumOfWins(){

        this.numOfWins++;
    }


}
