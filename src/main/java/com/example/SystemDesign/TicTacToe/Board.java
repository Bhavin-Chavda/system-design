package com.example.SystemDesign.TicTacToe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;


    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(" " + board[i][j].getPieceType() + " ");
                } else {
                    System.out.print("   "); // Empty cell
                }
                if (j < size - 1) {
                    System.out.print("|"); // Add column separator
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---".repeat(size - 1) + "---"); // Add row separator
            }
        }
    }


    public List<List<Integer>> getFreeCells()
    {
        List<List<Integer>> list_of_free_pairs = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                {
                    list_of_free_pairs.add(Arrays.asList(i,j));
                }
            }
        }
        return list_of_free_pairs;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col]==null)
        {
            board[row][col]=playingPiece;
            return true;
        }
        return false;
    }
}
