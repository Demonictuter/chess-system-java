package board_game;

public class Board {
    private int rows;
    private int collumns;
    private Piece[][] pieces;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollumns() {
        return collumns;
    }

    public void setCollumns(int collumns) {
        this.collumns = collumns;
    }

    public Board(int rows, int collumns) {
        this.rows = rows;
        this.collumns = collumns;
        pieces = new Piece[rows][collumns];
    }
    public Piece piece (int row, int collumn){
        return pieces[row][collumn];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getCollumn()];
    }
}