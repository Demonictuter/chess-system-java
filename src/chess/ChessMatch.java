package chess;
import board_game.Board;
import chess_Pieces.Rook;
import board_game.Position;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCollumns()];
        for(int i = 0; i<board.getRows(); i++){
            for(int j = 0; j<board.getCollumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 4));
    }
}







