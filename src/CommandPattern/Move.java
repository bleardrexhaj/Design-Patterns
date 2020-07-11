package CommandPattern;

public class Move implements Command{
    enum Direction {
        RIGHT,
        LEFT
    }

    private int move;
    private Direction direction;

    public Move(int move, Direction direction) {
        this.move = move;
        this.direction = direction;
    }

    public int getMove() {
        return move;
    }

    @Override
    public boolean execute() {
        System.out.println("Moving the square " + getMove() + " to the " + direction);
        return false;
    }

    @Override
    public boolean undo() {
        System.out.println("Moving the square back.......");
        return false;
    }

}
