package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] PossibleMoves();

    public boolean PossibleMove(Position position) { //retorna se pode mover essa peça dada uma posição.
        return PossibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){ //Retorna se a peça tem pelo menos algum movimento disponivel
        boolean[][] mat = PossibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

}
