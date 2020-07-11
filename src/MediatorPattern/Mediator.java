package MediatorPattern;

public class Mediator {
    private Board board;

    public Mediator(Board board) {
        this.board = board;
    }

    public void send(Player player, Position positon) {

        for (int i = 0; i < board.rows; i++) {
            for (int j = 0; j < board.columns; j++) {
                if (board.positions[i][j] == positon)
                    continue;
                board.positions[i][j].receivePosition(player, positon);
            }
            System.out.println();
        }
    }

}
