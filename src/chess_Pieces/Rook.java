package chess_Pieces;

import board_game.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    public void teste(){

    }

    @Override
    public String toString(){
        return "R";
    }
}
