package board_game;

public class Board {
    private int rows;
    private int collumns;
    private Piece[][] pieces;

    public int getRows() {
        return rows;
    }


    public int getCollumns() {
        return collumns;
    }


    public Board(int rows, int collumns) {
        if(rows < 1 || collumns < 1){
            throw new BoardException("error creating board: there must be at least a row and a column");
        }
        this.rows = rows;
        this.collumns = collumns;
        pieces = new Piece[rows][collumns];
    }
    public Piece piece (int row, int collumn){
        if(!positionExists(row, collumn)){
            throw new BoardException("position not on the board");
        }
        return pieces[row][collumn];
    }
    public Piece piece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("position not on the board");
        }
        return pieces[position.getRow()][position.getCollumn()];
    }
    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("there is already a piece on postion" + position);
        }
        pieces[position.getRow()][position.getCollumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row, int collumn){
        return row >= 0 && row < rows && collumn >= 0 && collumn < collumns;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getCollumn());
    }
    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("position not on the board");
        }
        return piece(position) !=null;
    }

}
