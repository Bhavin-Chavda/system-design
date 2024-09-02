package com.example.SystemDesign.TicTacToe;

public class PlayTicTacToe {
    public static void main(String[] args) {
        System.out.println("You can Start the Game Here");

        StartGame startGame = new StartGame();
        System.out.println("Game Winner is : "+startGame.StartPlaying());
    }
}
