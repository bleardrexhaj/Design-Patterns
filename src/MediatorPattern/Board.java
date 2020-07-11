package MediatorPattern;

public class Board {
    public int rows = 8;
    public int columns = 8;
    public Position[][] positions;
    public Mediator mediator;
    public boolean isInitialized;

    public Board() {
        mediator = new Mediator(this);
        positions = new Position[rows][columns];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                positions[i][j] = new Position(i, j, this);
                if ((i == 3 && j == 3) || (i == 4 && j == 4)) {
                    positions[i][j].setStone(new Stone("b"));
                }
                if ((i == 4 && j == 3) || (i == 3 && j == 4)) {
                    positions[i][j].setStone(new Stone("w"));
                }
            }
        }
        isInitialized = true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(positions[i][j]);
            }
            System.out.println();
        }
    }

    public void makeMove(int x, int y, String letter) {
        positions[x][y].setStone(new Stone(letter));
    }

}
