package org.academiadecodigo.stringrays;

public enum Hand {


    ROCK,
    PAPER,
    SCISSOR;


    public static Hand handGenerator(){

        int random = (int)Math.floor(Math.random() * Hand.values().length);

        return Hand.values()[random];
    }
}

