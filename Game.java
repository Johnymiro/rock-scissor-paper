package org.academiadecodigo.stringrays;

public class Game {

    private int numberOfGames;


    public Game(int numberOfGames) {

        this.numberOfGames = numberOfGames;
    }


    public void play(Player player1, Player player2) {


        for (int i = 0; i < numberOfGames; i++) {

            score(player1, player2);
        }


        judge(player1, player2);


    }



    private void judge(Player player1, Player player2) {


        if (player1.getNumOfWins() == player2.getNumOfWins()) {

            System.out.println("Player " + player1.getName() + " wins " + player1.getNumOfWins() + " times");
            System.out.println("Player " + player2.getName() + " wins " + player2.getNumOfWins() + " times");
            System.out.println("\nResult: Draw!!!");


        } else if (player1.getNumOfWins() < player2.getNumOfWins()) {

            System.out.println("Player " + player1.getName() + " wins " + player1.getNumOfWins() + " times");
            System.out.println("Player " + player2.getName() + " wins " + player2.getNumOfWins() + " times");
            System.out.println("\nResult: Player " + player2.getName() + " wins!!!");

        } else if (player1.getNumOfWins() > player2.getNumOfWins()) {

            System.out.println("Player " + player1.getName() + " wins " + player1.getNumOfWins() + " times");
            System.out.println("Player " + player2.getName() + " wins " + player2.getNumOfWins() + " times");
            System.out.println("\nResult: Player " + player1.getName() + " wins!!!");
        }


    }



    private void score(Player player1, Player player2) {

        if (player1.playerHand() == player2.playerHand()) {

            return;
        }

        Player winner = player1;

        switch (player1.playerHand()) {

            case ROCK: {

                switch (player2.playerHand()) {

                    case PAPER:
                        player2.incrementNumOfWins();
                        break;

                    case SCISSOR:
                        player1.incrementNumOfWins();
                        break;
                }
                break;
            }


            case PAPER: {

                switch (player2.playerHand()) {

                    case ROCK:
                        player1.incrementNumOfWins();
                        break;

                    case SCISSOR:
                        player2.incrementNumOfWins();
                        break;
                }
                break;
            }


            case SCISSOR: {

                switch (player2.playerHand()) {

                    case ROCK:
                        player2.incrementNumOfWins();
                        break;

                    case PAPER:
                        player1.incrementNumOfWins();
                        break;
                }
                break;
            }
        }

        winner.incrementNumOfWins();
    }

}
