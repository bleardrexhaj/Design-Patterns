package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Create createSquare = new Create(5);
        Scale scaleSquare = new Scale(2);
        Move moveSquare = new Move(3, Move.Direction.RIGHT);
        var manager = new CommandManager();
        manager.invoke(createSquare);
        manager.invoke(scaleSquare);
        manager.invoke(moveSquare);
        manager.undo();
    }
}
