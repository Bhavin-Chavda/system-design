package com.example.SystemDesign.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StartGame {

    Deque<Player> players;
    Board board;

    public StartGame() {
        
        initializeGame();
        
    }

    private void initializeGame() {
        players = new LinkedList<>();

        PieceX pieceX = new PieceX();
        Player player1 = new Player("Player1", pieceX);

        PieceO pieceO = new PieceO();
        Player player2 = new Player("Player2" , pieceO);

        players.add(player1);
        players.add(player2);

        board = new Board(3);

    }

    public String StartPlaying(){
        boolean noWinner = true;
        while(noWinner)
        {
            Player curr_player = players.removeFirst();

            board.printBoard();
            List<List<Integer>> isFreeSpace = board.getFreeCells();
            if(isFreeSpace.isEmpty())
            {
                noWinner = false;
                continue;
            }
            System.out.println("Player: "+curr_player.getName()+" , Enter Row,Column: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] values = str.split(",");
            if(values.length!=2)
            {
                System.out.println("Please Enter Comma Separated Row,Column");
                players.addFirst(curr_player);
                continue;
            }
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            System.out.println("row,column is : ("+row+","+col+")");
            System.out.println(board.size);
            if(row>= board.size || col >= board.size)
            {
                System.out.println("Please Enter Row and Column in Board Range");
                players.addFirst(curr_player);
                continue;
            }
            boolean pieceAdded = board.addPiece(row,col,curr_player.playingPiece);

            if(!pieceAdded)
            {
                System.out.println("Incorrect Position, Please Add correct Position");
                players.addFirst(curr_player);
                continue;

            }
            players.addLast(curr_player);
            boolean isWinner = isThereWinner(row,col,curr_player.playingPiece.getPieceType());

            if(isWinner)
            {
                return curr_player.getName();
            }


        }

        return "tie";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {

        boolean isRowMatch = true;
        boolean isColumnMatch = true;
        boolean isDiagonalMatch = true;
        boolean isAntiDiagonalMatch = true;

        for(int i=0;i<board.size;i++)
        {
            if(board.board[row][i]==null || board.board[row][i].getPieceType() != pieceType)
            {
                isRowMatch = false;
                break;
            }
        }

        for(int i=0;i<board.size;i++)
        {
            if(board.board[i][col]==null || board.board[i][col].getPieceType() != pieceType)
            {
                isColumnMatch = false;
                break;
            }
        }
        for(int i=0,j=0;i< board.size;i++,j++)
        {
            if(board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType)
            {
                isDiagonalMatch = false;
                break;
            }
        }

        for(int i=0,j= board.size-1;i< board.size;i++,j--)
        {
            if(board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType)
            {
                isAntiDiagonalMatch = false;
                break;
            }
        }

        return isRowMatch || isColumnMatch || isDiagonalMatch || isAntiDiagonalMatch;
    }
}
