package org.academiadecodigo.stringrays;

public class Main {

    public static void main(String[] args) {


        Game game1 = new Game(10);


        Player player1 = new Player("Johny");
        Player player2 = new Player("Ze Carias");


        game1.play(player1, player2);



    }
}
