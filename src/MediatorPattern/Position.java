package MediatorPattern;

public class Position {
    public int x;
    public int y;
    public Board board;
    public Stone stone;

    public Position(int x, int y, Board board) {
        this.x = x;
        this.y = y;
        this.board = board;
    }

    public void receivePosition(Player player, Position positon) {
        if (isEmpty())
            return;
        boolean hasSameColor = stone.letter == positon.stone.letter;
        if (hasSameColor)
            return;
        if (isVertical(positon) || isDiagonal(positon) || isHorizontal(positon))
            setStone(new Stone(positon.stone.letter));
    }

    private boolean isDiagonal(Position positon) {
        if (Math.abs(x - positon.x) != 1)
            return false;

        if (Math.abs(y - positon.y) != 1)
            return false;

        int yTmp = this.y;
        int xTmp = this.x;

        while ((yTmp < board.columns && y >= 0) && (xTmp < board.columns && x >= 0)) {
            Position p = board.positions[xTmp][yTmp];
            if (p.isEmpty())
                return false;

            if (p.stone.letter != stone.letter)
                return true;

            if (x < positon.x && y < positon.y) {
                yTmp--;
                xTmp--;
            } else if (x < positon.x && y > positon.y) {
                yTmp++;
                xTmp--;
            } else if (x > positon.x && y < positon.y) {
                yTmp--;
                xTmp++;
            } else {
                yTmp++;
                xTmp++;
            }
        }
        return false;
    }

    private boolean isVertical(Position positon) {
        if (y != positon.y)
            return false;
        if ((x - 1 != positon.x && x + 1 != positon.x))
            return false;

        int xTmp = this.x;
        while (xTmp < board.columns && x >= 0) {
            Position p = board.positions[xTmp][y];
            if (p.isEmpty())
                return false;

            if (p.stone.letter != stone.letter)
                return true;

            if (x < positon.x)
                xTmp--;
            else
                xTmp++;
        }
        return false;
    }

    private boolean isHorizontal(Position positon) {

        if (x != positon.x)
            return false;
        if ((y - 1 != positon.y && y + 1 != positon.y))
            return false;

        int yTmp = this.y;
        while (yTmp < board.columns && y >= 0) {
            Position p = board.positions[x][yTmp];
            if (p.isEmpty())
                return false;

            if (p.stone.letter != stone.letter)
                return true;

            if (y < positon.y)
                yTmp--;
            else
                yTmp++;
        }
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "-";
        return stone.letter;
    }

    public boolean isEmpty() {
        return (stone == null);
    }

    public void setStone(Stone stone) {
        this.stone = stone;
        if (this.board.isInitialized)
            this.board.mediator.send(null, this);
    }

}
