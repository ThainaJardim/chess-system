package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //pode não colocar nada se preferir, o java já joga nulo como padrão
    }

    protected Board getBoard() {
        return board;
    }
}
