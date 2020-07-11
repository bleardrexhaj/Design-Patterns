package CommandPattern;

public class Create implements Command{
    private int width;

    public Create(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean execute() {
        System.out.println("Creating Square " + getWidth() + "x" + getWidth());
        return false;
    }

    @Override
    public boolean undo() {
        System.out.println("Removing the square......");
        return false;
    }

}
